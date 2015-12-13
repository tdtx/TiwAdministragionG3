package AdministracionG3.model.daos;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
//import javax.persistence.NoResultException;
import javax.transaction.UserTransaction;


import AdministracionG3.model.dominios.Curso;
//import javax.persistence.Query;
import  AdministracionG3.model.dominios.Matriculados;

//import java.util.List;

public class MatriculadoDAO {
    private final EntityManager em;
    private final UserTransaction ut;

    public MatriculadoDAO(EntityManager em, UserTransaction ut) {
        super();
        this.em = em;
        this.ut = ut;
    }

    public Matriculados guardarMatriculado(Matriculados nuevoMatriculado) throws Exception{
        ut.begin();    
        em.persist(nuevoMatriculado); 
        ut.commit();   
        return nuevoMatriculado;
    }
    public Matriculados actualizarMatriculado(Matriculados matriculado) throws Exception{
        ut.begin();
        em.merge(matriculado);
        ut.commit();
        return matriculado;
    }
    
    public void borrarMatriculado(Matriculados matriculado)throws Exception{
        ut.begin();
        em.remove(em.merge(matriculado));
        ut.commit();
    }
    public Matriculados buscarTitulo(String titulo) {
		
		Query query =  em.createQuery("SELECT u FROM Curso u where u.titulo=:titulo", Matriculados.class);
		query.setParameter("titulo", titulo);
		List resultList = query.getResultList();
		if (resultList.isEmpty()) {
			return null;
		}else{
		
			return (Matriculados) query.getSingleResult();
		}
		
	}
    public List<Matriculados> buscarMatriculados(String titulo)throws Exception{
    	return em.createQuery("SELECT u FROM Matriculados u where u.titulo+='"+titulo+"'",Matriculados.class).getResultList();
	 }

    // public matriculados comprobarLogin(String email, String password)throws NoResultException{
    //    return em.createQuery("select u from Cliente u where u.email='"+email+"' and u.password='"+password+"'",matriculados.class).getSingleResult();
    // }
     
    public Matriculados buscarMatriculado(Long id) {
        return em.find(Matriculados.class, id);
    } 
}