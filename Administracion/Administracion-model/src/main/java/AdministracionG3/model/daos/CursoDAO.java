package AdministracionG3.model.daos;


import javax.persistence.EntityManager;

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
	 /*
	  * public usuarios comprobarLogin(String email, String password)throws NoResultException{
        return em.createQuery("select u from Cliente u where u.email='"+email+"' and u.password='"+password+"'",usuarios.class).getSingleResult();
     }
	  */
	    public Curso buscarCurso(Long id) {
	        return em.find(Curso.class, id);
	    } 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 




}
