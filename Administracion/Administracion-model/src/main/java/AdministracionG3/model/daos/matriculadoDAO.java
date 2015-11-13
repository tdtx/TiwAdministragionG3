package AdministracionG3.model.daos;

import javax.persistence.EntityManager;
//import javax.persistence.NoResultException;
import javax.transaction.UserTransaction;
//import javax.persistence.Query;
import AdministracionG3.model.dominios.matriculados;

//import java.util.List;

public class matriculadoDAO {
    private final EntityManager em;
    private final UserTransaction ut;

    public matriculadoDAO(EntityManager em, UserTransaction ut) {
        super();
        this.em = em;
        this.ut = ut;
    }

    public matriculados guardarMatriculado(matriculados nuevoMatriculado) throws Exception{
        ut.begin();    
        em.persist(nuevoMatriculado); 
        ut.commit();   
        return nuevoMatriculado;
    }
    public matriculados actualizarMatriculado(matriculados clienteMatriculado) throws Exception{
        ut.begin();
        em.merge(clienteMatriculado);
        ut.commit();
        return clienteMatriculado;
    }
    
    public void borrarMatriculado(matriculados matriculado)throws Exception{
        ut.begin();
        em.remove(em.merge(matriculado));
        ut.commit();
    }
    
    // public matriculados comprobarLogin(String email, String password)throws NoResultException{
    //    return em.createQuery("select u from Cliente u where u.email='"+email+"' and u.password='"+password+"'",matriculados.class).getSingleResult();
    // }
     
    public matriculados buscarMatriculado(Long id) {
        return em.find(matriculados.class, id);
    } 
}