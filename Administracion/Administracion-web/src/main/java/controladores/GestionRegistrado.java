package controladores;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;

import AdministracionG3.model.daos.UsuarioDAO;
//import AdministracionG3.model.daos.UsuarioDAO;
import AdministracionG3.model.dominios.Usuarios;

import java.util.List;
/**
 * Servlet implementation class GestionRegistrado
 */
@WebServlet(value="/gestionRegistrado",loadOnStartup=1)
public class GestionRegistrado extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String requistradoJSP = "/registrado.jsp";
	private static final String indexJSP = "/index.jsp";
	@PersistenceContext(unitName="Administracion-model")
	EntityManager em;
	@Resource
	UserTransaction ut;
	UsuarioDAO udao;
	   /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionRegistrado() {
        super();
        // TODO Auto-generated constructor stub
    }
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();

		udao =  new UsuarioDAO(em, ut);

	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String accion = request.getParameter("accion");
		String pagina = indexJSP;
		List registrados = null;	
		if (accion != null && accion.equals("ur")) {
					
			 try {
				registrados = udao.buscarUsuarios();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			request.setAttribute("registrados", registrados);
			pagina = requistradoJSP;
		}
		
	
		if(accion!=null && accion.equals("eliminarR")){
			String nick = request.getParameter("nick");
			Usuarios u = udao.buscarNick(nick);		
			 try {
				 	udao.borrarUsuario(u);
					registrados = udao.buscarUsuarios();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			request.setAttribute("registrados", registrados);
			pagina = requistradoJSP;
	}
		response.setContentType("text/html");
		this.getServletContext().getRequestDispatcher(pagina)
				.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nickREdit= request.getParameter("nickR");
        String nombreREdit = request.getParameter("nombreR");
        String apellido1REdit= request.getParameter("apellido1R");
        String apellido2REdit= request.getParameter("apellido2R");
        String correoREdit= request.getParameter("correoR");
        String fechaNcREdit= request.getParameter("fechaNcR");
        String pagina = indexJSP;
           try {
		    //    editarUR(nickREdit,nombreREdit,apellido1REdit,apellido2REdit,correoREdit,fechaNcREdit);   
		    //    request.setAttribute("registrados", registrados);
		        pagina = requistradoJSP;
		    } catch (Exception e) {
		        // TODO: handle exception
		        e.printStackTrace();
		        System.out.println("**Editar Registrado** Error al actualizar el registrado***");
		    }		
			response.setContentType("text/html");
			this.getServletContext().getRequestDispatcher(pagina).forward(request, response);
		}
/*
	private void  editarUR(String nick,String nombre,String ape1,String ape2,String correo,String fechaNac) {
		for (uRegistrado ur : registrados) {
			if (correo.equals(ur.getCorreo())){
				ur.setNick(nick);
				ur.setNombre(nombre);
				ur.setApellido1(ape1);
				ur.setApellido2(ape2);
				ur.setCorreo(correo);
				ur.setFechaNc(fechaNac);
				break;
			}
		}
	}*/
	
}
