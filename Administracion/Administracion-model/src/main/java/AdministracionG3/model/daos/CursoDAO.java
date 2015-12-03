package AdministracionG3.model.daos;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.UserTransaction;

import AdministracionG3.model.dominios.Curso;



public class CursoDAO{	
	  private final EntityManager em;
	    private final UserTransaction ut;
	    
	 public CursoDAO(EntityManager em, UserTransaction ut) {
			super();
			this.em = em;
			this.ut = ut;
		}
	//private Long id;
		
	 public Curso guardarCurso(Curso nuevoCurso) throws Exception{
		 ut.begin();
		 em.persist(nuevoCurso);
		 ut.commit();
		 return nuevoCurso;
	 }
	 public Curso actualizarCurso(Curso actualCurso) throws Exception{
		 ut.begin();
		 em.merge(actualCurso);
		 ut.commit();
		 return actualCurso;
	 }
	 public void borrarCurso(Curso curso) throws Exception{
		 ut.begin();
		 em.remove(em.merge(curso));
		 ut.commit();
		 
	 }
    //buscar por titulo
	public Curso buscarTitulo(String titulo) {
			
			Query query =  em.createQuery("SELECT u FROM Curso u where u.titulo=:titulo", Curso.class);
			query.setParameter("titulo", titulo);
			List resultList = query.getResultList();
			if (resultList.isEmpty()) {
				return null;
			}else{
			
				return (Curso) query.getSingleResult();
			}
			
		}
	 public List<Curso> buscarCursos()throws Exception{
	        return em.createQuery("SELECT u FROM Curso u",Curso.class).getResultList();
		 }
    public Curso buscarCurso(Long id) {
        return em.find(Curso.class, id);
    } 

}
