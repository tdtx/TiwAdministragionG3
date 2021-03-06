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
import javax.servlet.http.HttpSession;
import javax.transaction.UserTransaction;

import AdministracionG3.model.daos.CursoDAO;
import AdministracionG3.model.daos.MatriculadoDAO;
import AdministracionG3.model.daos.UsuarioDAO;
import AdministracionG3.model.dominios.Curso;
import AdministracionG3.model.dominios.Usuarios;
import AdministracionG3.model.dominios.Matriculados;



/**
 * Servlet implementation class GestionCurso
 */
@WebServlet("/gestionCurso")
public class GestionCurso extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String indexJSP = "/index.jsp";
	private static final String cursosJSP = "/cursos.jsp";   
	int promocionC;
	@PersistenceContext(unitName="Administracion-model")
	EntityManager em;
	@Resource
	UserTransaction ut;
	CursoDAO cdao;
	MatriculadoDAO mdao;
	UsuarioDAO udao;
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
    	mdao = new MatriculadoDAO(em, ut);
    	udao = new UsuarioDAO(em, ut);
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String accion = request.getParameter("accion");
		String pagina = indexJSP;
		List cursos = null;
		List matriculados = null;
		int[] beneficioProfe = new int[100];
		List bporfe = null;
		int beneficioAdmin = 0;
		HttpSession sesion = request.getSession();
		if (accion.equals("quitarPromoC")) {
			try {
				cursos = cdao.buscarCursos();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i = 0; i < cursos.size(); i++) {
				Curso c = (Curso) cursos.get(i);
				double precio = c.getPrecio();
				double promo=(double)(promocionC+13)/100;
				promo=precio*promo;
				double total=precio+promo;
				total = Math.round(total);
				c.setPrecio(total);
				try {
					cdao.actualizarCurso(c);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
			try {
				cursos = cdao.buscarCursos();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		request.setAttribute("cursos", cursos);
			sesion.setAttribute("promo", true);
	        pagina = cursosJSP;	
		}
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
		if (accion != null && accion.equals("ccc")) {
			try {
				matriculados = mdao.buscarMatriculados();
				cursos = cdao.buscarCursos();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i = 0; i < matriculados.size(); i++) {
				Matriculados m = (Matriculados) matriculados.get(i);
				Curso c = cdao.buscarTitulo(m.getCurso());
				Usuarios u = udao.buscarNick(c.getUsuario());
				double total = m.getPrecio_final();
				double profe = total*0.7;
				System.err.println("---------------->"+Math.round(profe));
				int p = Math.toIntExact(u.getId());
				beneficioProfe[p]+=Math.round(profe);
				System.err.println("-----//////----->"+p);
				System.err.println("--------++++++++-------->"+beneficioProfe[p]);
				beneficioAdmin += Math.round((total-profe));
				c.setDescuentoCupon(beneficioProfe[p]);
				try {
					cdao.actualizarCurso(c);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				cursos = cdao.buscarCursos();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("beneficioProfe", cursos);
			request.setAttribute("beneficioAdmin", beneficioAdmin);
			pagina = "/conciliacion.jsp";
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
		List matriculados = null;
        String pagina = indexJSP;
		String accion = request.getParameter("accion");
		HttpSession sesion = request.getSession();
		if (accion.equals("promocion")) {
			//promocion no puede superar el 30%
			promocionC = Integer.parseInt(request.getParameter("PromocionC"));
			try {
				cursos = cdao.buscarCursos();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i = 0; i < cursos.size(); i++) {
				Curso c = (Curso) cursos.get(i);
				double precio = c.getPrecio();
				double promo=(double)promocionC/100;
				promo=precio*promo;
				double total=precio-promo;
				total = Math.round(total);
				c.setPrecio(total);
				try {
					cdao.actualizarCurso(c);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
			try {
				cursos = cdao.buscarCursos();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			sesion.setAttribute("promo", false);		
    		request.setAttribute("cursos", cursos);
	        pagina = cursosJSP;	
			
		}else{
		long idCEdit = Integer.parseInt(request.getParameter("idC"));
		String tituloCEdit= request.getParameter("tituloC");
        String descripcionCEdit = request.getParameter("descripcionC");
        String nHorasCEdit= request.getParameter("horasC");
        String temariosCEdit= request.getParameter("temarioC");
        String usuarioCEdit= request.getParameter("usuarioC");
        String nivelCEdit= request.getParameter("nivelC");
        String certificadoCEdit= request.getParameter("certificadoC");   
        String categoriaCEdit= request.getParameter("categoriaC");
        String destacadoCEdit= request.getParameter("destacadoC");      
        String validacionCEdit = request.getParameter("validacionC");
        double precioCEdit= Double.parseDouble(request.getParameter("precioC"));
        String tOfertaCEdit= request.getParameter("tipoOfertaC");
        String fechaFinCEdit= request.getParameter("fechaCaducidadC"); 
        String fechaInicioCEdit= request.getParameter("fechaInicioC"); 
        int contador = Integer.parseInt(request.getParameter("contadorC"));
        contador = 0;
        
        String img = "imagenes/addressbook_add_128.png";

        
        
        try {
		    	Curso c = cdao.buscarCurso(idCEdit);
		    	matriculados = mdao.buscarMatriculados(c.getTitulo());
		    	for (int j = 0; j < matriculados.size(); j++) {
					Matriculados m = (Matriculados) matriculados.get(j);
					m.setCurso(tituloCEdit);
					m.setPrecio_final(precioCEdit);
					mdao.actualizarMatriculado(m);
				}
		    	
		    	contador = matriculados.size();
		    	if (c!= null) {
					c.setTitulo(tituloCEdit);
					c.setDescripcion(descripcionCEdit);
					c.setHoras(nHorasCEdit);
					c.setTemario(temariosCEdit);
					c.setUsuario(usuarioCEdit);
					c.setNivel(nivelCEdit);
					c.setCertificado(certificadoCEdit);
					c.setCategoria(categoriaCEdit);
					c.setDestacado(destacadoCEdit);
					c.setValidacion(validacionCEdit);
					c.setPrecio(precioCEdit);
					c.setTipoOferta(tOfertaCEdit);
					c.setFechaCaducidad(fechaFinCEdit);
					c.setDescuentoCupon(10);
					c.setFechaInicio(fechaInicioCEdit);
					c.setIdImagen(img);					
					c.setContador(contador);			
					cdao.actualizarCurso(c);			
				}
		    	cursos = cdao.buscarCursos();
		    	matriculados = mdao.buscarMatriculados();
        		request.setAttribute("cursos", cursos);
		        pagina = cursosJSP;
		    } catch (Exception e) {
		        // TODO: handle exception
		        e.printStackTrace();
		        System.out.println("**Editar Registrado** Error al actualizar el registrado***");
		    }		
		}
			response.setContentType("text/html");
			this.getServletContext().getRequestDispatcher(pagina).forward(request, response);
		}




}
