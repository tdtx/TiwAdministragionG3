package AdministracionG3.model.daos;

import javax.persistence.EntityManager;
//import javax.persistence.NoResultException;
import javax.transaction.UserTransaction;
//import javax.persistence.Query;
import AdministracionG3.model.dominios.ResultadosPruebas;

//import java.util.List;

public class ResultadoPruebaDAO {
    private final EntityManager em;
    private final UserTransaction ut;

    public ResultadoPruebaDAO(EntityManager em, UserTransaction ut) {
        super();
        this.em = em;
        this.ut = ut;
    }

    public ResultadosPruebas guardarResultadoPrueba(ResultadosPruebas nuevoResultadoPrueba) throws Exception{
        ut.begin();    
        em.persist(nuevoResultadoPrueba); 
        ut.commit();   
        return nuevoResultadoPrueba;
    }
    public ResultadosPruebas actualizarResultadoPrueba(ResultadosPruebas resultadoPrueba) throws Exception{
        ut.begin();
        em.merge(resultadoPrueba);
        ut.commit();
        return resultadoPrueba;
    }
    
    public void borrarResultadoPrueba(ResultadosPruebas resultadoPrueba)throws Exception{
        ut.begin();
        em.remove(em.merge(resultadoPrueba));
        ut.commit();
    }
    
     
     
    public ResultadosPruebas buscarCliente(Long id) {
        return em.find(ResultadosPruebas.class, id);
    } 
}

