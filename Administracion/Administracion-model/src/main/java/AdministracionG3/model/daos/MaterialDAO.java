package AdministracionG3.model.daos;
import javax.persistence.EntityManager;
import javax.transaction.UserTransaction;

import AdministracionG3.model.dominios.Material;

public class MaterialDAO {
	
	 private final EntityManager em;
	    private final UserTransaction ut;
	    
	 public MaterialDAO(EntityManager em, UserTransaction ut) {  
			super();
			this.em = em;
			this.ut = ut;
		}
	//private Long id;
		
	 public Material guardarMaterial(Material nuevoMaterial) throws Exception{
		 ut.begin();
		 em.persist(nuevoMaterial);
		 ut.commit();
		 return nuevoMaterial;
	 }
	 public Material actualizarMaterial(Material actualMaterial) throws Exception{
		 ut.begin();
		 em.merge(actualMaterial);
		 ut.commit();
		 return actualMaterial;
	 }
	 public void borrarMaterial(Material material) throws Exception{
		 ut.begin();
		 em.remove(em.merge(material));
		 ut.commit();
		 
	 }
	 /*
	  * public usuarios comprobarLogin(String email, String password)throws NoResultException{
     return em.createQuery("select u from Cliente u where u.email='"+email+"' and u.password='"+password+"'",usuarios.class).getSingleResult();
  }
	  */
	    public Material buscarMaterial(Long id) {
	        return em.find(Material.class, id);
	    } 
	
	
	
	
}
