package AdministracionG3.model.daos;
import javax.persistence.EntityManager;
//import javax.persistence.NoResultException;
import javax.transaction.UserTransaction;
//import javax.persistence.Query;
import AdministracionG3.model.dominios.Pruebas;

//import java.util.List;

public class PruebaDAO {
    private final EntityManager em;
    private final UserTransaction ut;

    public PruebaDAO(EntityManager em, UserTransaction ut) {
        super();
        this.em = em;
        this.ut = ut;
    }

    public Pruebas guardarPrueba(Pruebas nuevaPrueba) throws Exception{
        ut.begin();    
        em.persist(nuevaPrueba); 
        ut.commit();   
        return nuevaPrueba;
    }
    public Pruebas actualizarPrueba(Pruebas prueba) throws Exception{
        ut.begin();
        em.merge(prueba);
        ut.commit();
        return prueba;
    }
    
    public void borrarPrueba(Pruebas prueba)throws Exception{
        ut.begin();
        em.remove(em.merge(prueba));
        ut.commit();
    }
    
   
     
    public Pruebas buscarPrueba(Long id) {
        return em.find(Pruebas.class, id);
    } 
}

