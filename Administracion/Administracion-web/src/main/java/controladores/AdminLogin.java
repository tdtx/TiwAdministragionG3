package controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dominio.crearCurso;
import dominio.uMarculado;
import dominio.uRegistrado;

/**
 * Servlet de ejemplo que muestra distintos aspectos dentro de los ambitos
 * request y session. -Como usar el metodo init para inicializar datos -Como
 * recoger datos desde un formulario por post -Como no permitir acceso por get
 * redirigiendo a la pagina de login.jsp -Uso del objeto RequestDispatcher y
 * forward -Introduccion de atributos en el objeto request -Uso de objeto sesion
 * para mantener al usuario autenticado -Control de flujo y logica de negicio de
 * un controlador.
 * 
 */
@WebServlet("/login")
public class AdminLogin extends HttpServlet {
	private static final String indexJSP = "/index.jsp";
	private static final String longinJSP = "/login.jsp";
	private static final String requistradoJSP = "/registrado.jsp";
	private static final String matriculadoJSP = "/matriculado.jsp";
	private static final String cursosJSP = "/cursos.jsp";
	private static final long serialVersionUID = 1L;
	private crearCurso cc;
	private uMarculado um;
	private uRegistrado ur;
	private ArrayList<uRegistrado> registrados;
	private ArrayList<uMarculado> matriculados;
	private ArrayList<crearCurso> cursos;
	public AdminLogin() {
		super();
	}

	@Override
	public void init() throws ServletException {
		uRegistrado ur1 = new uRegistrado("TDTX", "Tomas", "Tee", "Xia", "tomas@tomas.es", "clave", "23/09/1990");
		uRegistrado ur2 = new uRegistrado("JSTX", "Juan", "Tee", "Xia", "juan@juan.es", "clave", "23/12/1991");
		
		registrados = new ArrayList<uRegistrado>();
		registrados.add(ur1);
		registrados.add(ur2);
		
		uMarculado um1 = new uMarculado("TDTX", "Tomas", "Tee", "Xia", "tomas@tomas.es", "clave", "23/09/1990", 777777777, "M", "calle", "localidad", 11111, "provincia", "pais", "fonts/users_folder_128.png", "dni", "cupon", "precio", "logro", "cursos");
		uMarculado um2 = new uMarculado("JSTX", "Juan", "Tee", "Xia", "juan@juan.es", "clave", "23/12/1991", 666666666, "M", "calle", "localidad", 22222, "provincia", "pais", "fonts/users_folder_128.png", "dni", "cupon", "precio", "logro", "cursos");
		
		matriculados = new ArrayList<uMarculado>();
		matriculados.add(um1);
		matriculados.add(um2);
		
		crearCurso cc1 = new crearCurso(1, "calculo", "matematica 1", "100", "corto-b", "Tomas", "si", "si", "1", "docente", "si", "si", "si", "si", "si", "100€", "si", "fonts/addressbook_add_128.png", "bajo-b", "26/10/2015", "26/10/2016", "juan", "26/12/2016","no");
		crearCurso cc2 = new crearCurso(2, "calculo diferencial", "matematica 2", "200", "corto-a", "juan", "si", "si", "2", "docente", "si", "si", "si", "no",  "no", "200€", "no", "fonts/addressbook_add_128.png", "bajo-a", "26/10/2015", "26/10/2016", "tomas", "26/12/2016","no");
		crearCurso cc3 = new crearCurso(3, "calculo discreto", "matematica 3", "300", "medio-b", "Tomas", "si", "si", "3", "docente", "si", "si", "si", "si", "si", "300€", "si", "fonts/addressbook_add_128.png", "medio-b", "26/10/2015", "26/10/2016", "juan", "26/12/2016","si");
		crearCurso cc4 = new crearCurso(4, "calculo algebraico", "matematica 4", "400", "corto-a", "juan", "si", "si", "4", "docente", "si", "si", "si", "no",  "no", "400€", "no", "fonts/addressbook_add_128.png", "medio-a", "26/10/2015", "26/10/2016", "tomas", "26/12/2016","no");
		crearCurso cc5 = new crearCurso(5, "calculo fisico", "matematica 5", "500", "alto-b", "Tomas", "si", "si", "5", "docente", "si", "si", "si", "no", "no", "500€", "no", "fonts/addressbook_add_128.png", "alto-b", "26/10/2015", "26/10/2016", "juan", "26/12/2016","no");
		crearCurso cc6 = new crearCurso(6, "calculo espacial", "matematica 6", "600", "alto-a", "juan", "si", "si", "6", "docente", "si", "si", "si", "no",  "no", "600€", "no", "fonts/addressbook_add_128.png", "alto-a", "26/10/2015", "26/10/2016", "tomas", "26/12/2016","no");
		
		cursos = new ArrayList<crearCurso>();
		cursos.add(cc1);
		cursos.add(cc2);
		cursos.add(cc3);
		cursos.add(cc4);
		cursos.add(cc5);
		cursos.add(cc6);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)e
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String accion = request.getParameter("accion");
		String pagina = indexJSP;
		if (accion != null && accion.equals("salir")) {
			pagina = indexJSP;
			request.getSession().invalidate();
		}
		if (accion != null && accion.equals("ur")) {
			request.setAttribute("registrados", registrados);
			pagina = requistradoJSP;
		}
		if (accion != null && accion.equals("um")) {
			request.setAttribute("matriculados", matriculados);
			pagina = matriculadoJSP;
		}
		if (accion != null && accion.equals("cc")) {
			request.setAttribute("cursos", cursos);
			pagina = cursosJSP;
		}
		this.getServletContext().getRequestDispatcher(pagina)
				.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String user = request.getParameter("usuario");
		String pass = request.getParameter("pass");
		String mensaje = "";
		String pagina = "";
		pagina = longinJSP;
		HttpSession sesion = request.getSession(true);
		if (user.equals("admin@admin.es") && pass.equals("admin")) {
			pagina = indexJSP;
			sesion.setAttribute("acceso", "ok");
			

		} else {

			mensaje = "Usuario o contraseña incorrectos";
			request.setAttribute("mensaje", mensaje);
		}

		this.getServletContext().getRequestDispatcher(pagina)
				.forward(request, response);

	}
}
