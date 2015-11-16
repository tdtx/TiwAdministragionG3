package AdministracionG3.model.daos;

import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;

import AdministracionG3.model.dominios.Seccion;

public class SeccionDAO {

	
	 private final EntityManager em;
	    private final UserTransaction ut;
	    
	 public SeccionDAO(EntityManager em, UserTransaction ut) {
			super();
			this.em = em;
			this.ut = ut;
		}
	//private Long id;
		
	 public Seccion guardarSeccion(Seccion nuevoSeccion) throws Exception{
		 ut.begin();
		 em.persist(nuevoSeccion);
		 ut.commit();
		 return nuevoSeccion;
	 }
	 public Seccion actualizarSeccion(Seccion actualSeccion) throws Exception{
		 ut.begin();
		 em.merge(actualSeccion);
		 ut.commit();
		 return actualSeccion;
	 }
	 public void borrarSeccion(Seccion seccion) throws Exception{
		 ut.begin();
		 em.remove(em.merge(seccion));
		 ut.commit();
		 
	 }
	 /*
	  * public usuarios comprobarLogin(String email, String password)throws NoResultException{
     return em.createQuery("select u from Cliente u where u.email='"+email+"' and u.password='"+password+"'",usuarios.class).getSingleResult();
  }
	  */
	    public Seccion buscarSeccion(Long id) {
	        return em.find(Seccion.class, id);
	    } 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
