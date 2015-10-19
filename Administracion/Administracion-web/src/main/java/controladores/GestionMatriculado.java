package controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
     */
    public GestionMatriculado() {
        super();
        // TODO Auto-generated constructor stub
    }
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();

		uMarculado um1 = new uMarculado("TDTX", "Tomas", "Tee", "Xia", "tomas@tomas.es", "clave", "23/09/1990", 777777777, "M", "calle", "localidad", 11111, "provincia", "pais", "fonts/users_folder_128.png", "dni", "cupon", "precio", "logro", "cursos");
		uMarculado um2 = new uMarculado("JSTX", "Juan", "Tee", "Xia", "juan@juan.es", "clave", "23/12/1991", 666666666, "M", "calle", "localidad", 22222, "provincia", "pais", "fonts/users_folder_128.png", "dni", "cupon", "precio", "logro", "cursos");
		
		matriculados = new ArrayList<uMarculado>();
		matriculados.add(um1);
		matriculados.add(um2);
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
		// TODO Auto-generated method stub
	}

}
