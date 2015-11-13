package AdministracionG3.model.daos;

import javax.persistence.EntityManager;
//import javax.persistence.NoResultException;
import javax.transaction.UserTransaction;
//import javax.persistence.Query;
import AdministracionG3.model.dominios.pruebas;

//import java.util.List;

public class pruebaDAO {
    private final EntityManager em;
    private final UserTransaction ut;

    public pruebaDAO(EntityManager em, UserTransaction ut) {
        super();
        this.em = em;
        this.ut = ut;
    }

    public pruebas guardarPrueba(pruebas nuevaPrueba) throws Exception{
        ut.begin();    
        em.persist(nuevaPrueba); 
        ut.commit();   
        return nuevaPrueba;
    }
    public pruebas actualizarPrueba(pruebas clientePrueba) throws Exception{
        ut.begin();
        em.merge(clientePrueba);
        ut.commit();
        return clientePrueba;
    }
    
    public void borrarPrueba(pruebas prueba)throws Exception{
        ut.begin();
        em.remove(em.merge(prueba));
        ut.commit();
    }
    
   
     
    public pruebas buscarPrueba(Long id) {
        return em.find(pruebas.class, id);
    } 
}

