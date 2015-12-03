package controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;

import AdministracionG3.model.daos.CursoDAO;
import AdministracionG3.model.dominios.Curso;
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
	@PersistenceContext(unitName="Administracion-model")
	EntityManager em;
	@Resource
	UserTransaction ut;
	CursoDAO cdao;
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
    	cdao = new CursoDAO(em, ut);
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String accion = request.getParameter("accion");
		String pagina = indexJSP;
		List cursos = null;
		if (accion != null && accion.equals("cc")) {
			try {
				cursos = cdao.buscarCursos();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("cursos", cursos);
			pagina = cursosJSP;
		}
		if(accion!=null && accion.equals("eliminarC")){
			String titulo = request.getParameter("titulo");
			Curso c = cdao.buscarTitulo(titulo);
			try {
				cdao.borrarCurso(c);
				cursos = cdao.buscarCursos();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("cursos", cursos);
			pagina = cursosJSP;
		}
		response.setContentType("text/html");
		this.getServletContext().getRequestDispatcher(pagina)
				.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List cursos = null;
		long idCEdit = Integer.parseInt(request.getParameter("idC"));
		String tituloCEdit= request.getParameter("tituloC");
        String descripcionCEdit = request.getParameter("descripcionC");
        String nHorasCEdit= request.getParameter("horasC");
        String temariosCEdit= request.getParameter("temarioC");
        String profesorCEdit= request.getParameter("idProfesorC");
        String nivelCEdit= request.getParameter("nivelC");
        String certificadoCEdit= request.getParameter("certificadoC");   
        String categoriaCEdit= request.getParameter("categoriaC");
        String destacadoCEdit= request.getParameter("destacadoC");      
        String estadoCEdit = request.getParameter("estadoC");
        double precioCEdit= Integer.parseInt(request.getParameter("precioC"));
        String tOfertaCEdit= request.getParameter("tipoOfertaC");
        String fechaFinCEdit= request.getParameter("fechaCaducidadC"); 
        String valorCEdit= request.getParameter("valorC");       
        String pagina = indexJSP;
        try {
		    	Curso c = cdao.buscarCurso(idCEdit);
		    	if (c!= null) {
					c.setTitulo(tituloCEdit);
					c.setDescripcion(descripcionCEdit);
					c.setHoras(nHorasCEdit);
					c.setTemario(temariosCEdit);
					c.setIdProfesor(profesorCEdit);
					c.setNivel(nivelCEdit);
					c.setCertificado(certificadoCEdit);
					c.setCategoria(categoriaCEdit);
					c.setDestacado(destacadoCEdit);
					c.setEstado(estadoCEdit);
					c.setPrecio(precioCEdit);
					c.setTipoOferta(tOfertaCEdit);
					c.setFechaCaducidad(fechaFinCEdit);
					c.setValor(valorCEdit);
					cdao.actualizarCurso(c);
				}
		    	cursos = cdao.buscarCursos();
        		request.setAttribute("cursos", cursos);
		        pagina = cursosJSP;
		    } catch (Exception e) {
		        // TODO: handle exception
		        e.printStackTrace();
		        System.out.println("**Editar Registrado** Error al actualizar el registrado***");
		    }		
			response.setContentType("text/html");
			this.getServletContext().getRequestDispatcher(pagina).forward(request, response);
		}




}
