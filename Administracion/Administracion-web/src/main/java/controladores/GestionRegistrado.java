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
		List registrados = null;	
		long idR= Integer.parseInt(request.getParameter("idR"));
        String nickREdit= request.getParameter("nickR");
        String nombreREdit = request.getParameter("nombreR");
        String apellido1REdit= request.getParameter("apellido1R");
        String apellido2REdit= request.getParameter("apellido2R");
        String correoREdit= request.getParameter("correoR");
        String fechaNcREdit= request.getParameter("fechaNcR");
        String tarjetaREdit= request.getParameter("tarjetaR");
        String idImagenREdit = "fonts/users_folder_128.png";
        String descripcionREdit= request.getParameter("descripcionR");
        String aficionesREdit= request.getParameter("aficionesR");
        String calleREdit= request.getParameter("calleR");
        String localidadREdit= request.getParameter("localidadR");
        int codigoPostalREdit= Integer.parseInt(request.getParameter("codigoPostalR"));
        String provinciaREdit= request.getParameter("provinciaR");
        String rolREdit= request.getParameter("rolR");
        String dniREdit= request.getParameter("dniR");
        String generoREdit= request.getParameter("generoR");
        int telefonoREdit= Integer.parseInt(request.getParameter("telefonoR"));
        String pagina = indexJSP;
           try {
        	    Usuarios u = udao.buscarId(idR);
        	    if (u!= null) {
        	    	u.setNick(nickREdit);
    		        u.setNombre(nombreREdit);
    		        u.setApellido1(apellido1REdit);
    		        u.setApellido2(apellido2REdit);
    		        u.setCorreo(correoREdit);
    		        u.setFechanac(fechaNcREdit);
    		        u.setTarjeta(tarjetaREdit);
    		        u.setIdImagen(idImagenREdit);
    		        u.setDescripcion(descripcionREdit);
    		        u.setAficiones(aficionesREdit);
    		        u.setCalle(calleREdit);
    		        u.setLocalidad(localidadREdit);
    		        u.setCodigoPostal(codigoPostalREdit);
    		        u.setProvincia(provinciaREdit);
    		        u.setRol(rolREdit);
    		        u.setDni(dniREdit);
    		        u.setGenero(generoREdit);
    		        u.setTelefono(telefonoREdit);
    		    	udao.actualizarUsuario(u);
				}		        
		        registrados = udao.buscarUsuarios();
		        request.setAttribute("registrados", registrados);
		        pagina = requistradoJSP;
		    } catch (Exception e) {
		        // TODO: handle exception
		        e.printStackTrace();
		        System.out.println("**Editar Registrado** Error al actualizar el registrado***");
		    }		
			response.setContentType("text/html");
			this.getServletContext().getRequestDispatcher(pagina).forward(request, response);
		}
	
}
