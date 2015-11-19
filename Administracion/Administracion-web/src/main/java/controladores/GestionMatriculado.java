package controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;

//import AdministracionG3.model.daos.UsuarioDAO;
import dominio.uMarculado;

/**
 * Servlet implementation class GestionMatriculado
 */
@WebServlet("/gestionMatriculado")
public class GestionMatriculado extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<uMarculado> matriculados;
	private static final String indexJSP = "/index.jsp";
	private static final String matriculadoJSP = "/matriculado.jsp";
    /**
     * @see HttpServlet#HttpServlet()
 
	@PersistenceContext(unitName="Administracion-model")
	EntityManager em;
	@Resource
	UserTransaction ut;
	UsuarioDAO udao;    */
    public GestionMatriculado() {
        super();
        // TODO Auto-generated constructor stub
    }
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();

		uMarculado um1 = new uMarculado("TDTX", "Tomas", "Tee", "Xia", "tomas@tomas.es", "clave", "23/09/1990", 777777777, "Hombre", "calle", "localidad", 11111, "provincia", "Spain", "fonts/users_folder_128.png", "78614836p", "No", "30", "logro", "cursos");
		uMarculado um2 = new uMarculado("JSTX", "Juan", "Tee", "Xia", "juan@juan.es", "clave", "23/11/1991", 666666666, "Mujer", "calle", "localidad", 22222, "provincia", "Spain", "fonts/users_folder_128.png", "12345678p", "No", "50", "logro", "cursos");
		
		matriculados = new ArrayList<uMarculado>();
		matriculados.add(um1);
		matriculados.add(um2);
	//	udao = new UsuarioDAO(em, ut);
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String accion = request.getParameter("accion");
		String pagina = indexJSP;
		if (accion != null && accion.equals("um")) {
			request.setAttribute("matriculados", matriculados);
			pagina = matriculadoJSP;
		}
		if(accion!=null && accion.equals("eliminarM")){
			String correo = request.getParameter("correo");
			eliminarMatriculado(correo);
			request.setAttribute("matriculados", matriculados);
			pagina = matriculadoJSP;
		}
		response.setContentType("text/html");
		this.getServletContext().getRequestDispatcher(pagina)
				.forward(request, response);
	}
	private void eliminarMatriculado(String correo) {
		int x = 0;
		for (uMarculado uM : matriculados) {
			if (correo.equals(uM.getCorreo())){
				matriculados.remove(x);
				break;
			}
			x++;
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 	String nickMEdit= request.getParameter("nickM");
	        String nombreMEdit = request.getParameter("nombreM");
	        String apellido1MEdit= request.getParameter("apellido1M");
	        String apellido2MEdit= request.getParameter("apellido2M");
	        String correoMEdit= request.getParameter("correoM");
	        String fechaNcMEdit= request.getParameter("fechaNcM");
	        int telefonoMEdit = Integer.parseInt(request.getParameter("telefonoM"));
	        String generoMEdit = request.getParameter("generoM");
	        String calleMEdit= request.getParameter("calleM");
	        String localidadMEdit= request.getParameter("localidadM");
	        int cpMEdit = Integer.parseInt(request.getParameter("cpM"));
	        String provinciaMEdit = request.getParameter("provinciaM");
	        String paisMEdit= request.getParameter("paisM");
	        String dniMEdit= request.getParameter("dniM");
	        String cuponMEdit = request.getParameter("cuponM");
	        String precioMEdit= request.getParameter("precioM");
	        String logroMEdit= request.getParameter("logroM");
	        String cursosMEdit= request.getParameter("cursosM");
	        String pagina = indexJSP;
	        try {
			    	editarUM(nickMEdit,nombreMEdit,apellido1MEdit,apellido2MEdit,correoMEdit,fechaNcMEdit,telefonoMEdit,generoMEdit,calleMEdit
			    			,localidadMEdit,cpMEdit,provinciaMEdit,paisMEdit,dniMEdit,cuponMEdit,precioMEdit,logroMEdit,cursosMEdit);   
			        request.setAttribute("matriculados", matriculados);
			        pagina = matriculadoJSP;
			    } catch (Exception e) {
			        // TODO: handle exception
			        e.printStackTrace();
			        System.out.println("**Editar Registrado** Error al actualizar el registrado***");
			    }		
				response.setContentType("text/html");
				this.getServletContext().getRequestDispatcher(pagina).forward(request, response);
			}


		private void  editarUM(String nick,String nombre,String ape1,String ape2,String correo,String fechaNac, int tel,String genero,
				String calle, String localidad,int cp,String provincia,String pais,String dni,String cupon,String precio,String logro,String cursos) {
			for (uMarculado um : matriculados) {
				if (correo.equals(um.getCorreo())){
					um.setNick(nick);
					um.setNombre(nombre);
					um.setApellido1(ape1);
					um.setApellido2(ape2);
					um.setCorreo(correo);
					um.setFechaNc(fechaNac);
					um.setTelefono(tel);
					um.setGenero(genero);
					um.setCalle(calle);
					um.setLocalidad(localidad);
					um.setCp(cp);
					um.setProvincia(provincia);
					um.setPais(pais);
					um.setDni(dni);
					um.setCupon(cupon);
					um.setPrecio(precio);
					um.setLogro(logro);
					um.setCursos(cursos);
					break;
				}
			}
		}

}
