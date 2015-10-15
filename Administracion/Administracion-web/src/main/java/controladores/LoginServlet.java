package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
public class LoginServlet extends HttpServlet {
	private static final String ENTRADA_JSP = "/index.jsp";
	private static final String LOGIN_JSP = "/login.jsp";
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String salir = request.getParameter("accion");
		if (salir != null && !salir.equals("")) {
			request.getSession().invalidate();
		}
		this.getServletContext().getRequestDispatcher(LOGIN_JSP)
				.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String user = request.getParameter("usuario");
		String pass = request.getParameter("password");
		String mensaje = "";
		String pagina = "";
		pagina = LOGIN_JSP;
		HttpSession sesion = request.getSession(true);
		if (user.equals("admin") && pass.equals("admin")) {
			pagina = ENTRADA_JSP;
			sesion.setAttribute("acceso", "ok");

		} else {

			mensaje = "Usuario o contraseña incorrectos";
			request.setAttribute("mensaje", mensaje);
		}

		this.getServletContext().getRequestDispatcher(pagina)
				.forward(request, response);

	}
}
