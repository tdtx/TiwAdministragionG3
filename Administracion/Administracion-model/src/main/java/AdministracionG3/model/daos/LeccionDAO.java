package AdministracionG3.model.daos;

import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;

import AdministracionG3.model.dominios.Leccion;

public class LeccionDAO {

	 private final EntityManager em;
	    private final UserTransaction ut;
	    
	 public LeccionDAO(EntityManager em, UserTransaction ut) {
			super();
			this.em = em;
			this.ut = ut;
		}
	//private Long id;
		
	 public Leccion guardarLeccion(Leccion nuevoLeccion) throws Exception{
		 ut.begin();
		 em.persist(nuevoLeccion);
		 ut.commit();
		 return nuevoLeccion;
	 }
	 public Leccion actualizarLeccion(Leccion actualLeccion) throws Exception{
		 ut.begin();
		 em.merge(actualLeccion);
		 ut.commit();
		 return actualLeccion;
	 }
	 public void borrarLeccion(Leccion leccion) throws Exception{
		 ut.begin();
		 em.remove(em.merge(leccion));
		 ut.commit();
		 
	 }
	 /*
	  * public usuarios comprobarLogin(String email, String password)throws NoResultException{
     return em.createQuery("select u from Cliente u where u.email='"+email+"' and u.password='"+password+"'",usuarios.class).getSingleResult();
  }
	  */
	    public Leccion buscarLeccion(Long id) {
	        return em.find(Leccion.class, id);
	    } 
	
	
	
	
	
	
	
	
}
