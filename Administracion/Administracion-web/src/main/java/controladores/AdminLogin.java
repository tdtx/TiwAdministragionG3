package controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.ejb.Remove;
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
	private static final long serialVersionUID = 1L;
	public AdminLogin() {
		super();
	}

	@Override
	public void init() throws ServletException {
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
			pagina = longinJSP;
			request.getSession().invalidate();
		}	
		response.setContentType("text/html");
		this.getServletContext().getRequestDispatcher(pagina)
				.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

		this.getServletContext().getRequestDispatcher(pagina).forward(request, response);

	}
}
