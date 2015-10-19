package controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.crearCurso;

/**
 * Servlet implementation class GestionCurso
 */
@WebServlet("/gestionCurso")
public class GestionCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String indexJSP = "/index.jsp";
	private static final String cursosJSP = "/cursos.jsp";   
	private ArrayList<crearCurso> cursos;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionCurso() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String accion = request.getParameter("accion");
		String pagina = indexJSP;
		if (accion != null && accion.equals("cc")) {
			request.setAttribute("cursos", cursos);
			pagina = cursosJSP;
		}
		if(accion!=null && accion.equals("eliminarC")){
			String titulo = request.getParameter("titulo");
			eliminarCurso(titulo);
			request.setAttribute("cursos", cursos);
			pagina = cursosJSP;
		}
		response.setContentType("text/html");
		this.getServletContext().getRequestDispatcher(pagina)
				.forward(request, response);
	}
	private void eliminarCurso(String titulo) {
		int x = 0;
		for (crearCurso cC : cursos) {
			if (titulo.equals(cC.getTitulo())){
				cursos.remove(x);
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
