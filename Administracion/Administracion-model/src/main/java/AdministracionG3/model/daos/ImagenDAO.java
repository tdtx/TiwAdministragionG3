package AdministracionG3.model.daos;

import javax.persistence.EntityManager;
//import javax.persistence.NoResultException;
import javax.transaction.UserTransaction;
//import javax.persistence.Query;
import AdministracionG3.model.dominios.Imagenes;

//import java.util.List;

public class ImagenDAO {
    private final EntityManager em;
    private final UserTransaction ut;

    public ImagenDAO(EntityManager em, UserTransaction ut) {
        super();
        this.em = em;
        this.ut = ut;
    }

    public Imagenes guardarImagen(Imagenes nuevaImagen) throws Exception{
        ut.begin();    
        em.persist(nuevaImagen); 
        ut.commit();   
        return nuevaImagen;
    }
    public Imagenes actualizarImagen(Imagenes imagen) throws Exception{
        ut.begin();
        em.merge(imagen);
        ut.commit();
        return imagen;
    }
    
    public void borrarImagen(Imagenes imagen)throws Exception{
        ut.begin();
        em.remove(em.merge(imagen));
        ut.commit();
    }
    
     
    public Imagenes buscarImagen(Long id) {
        return em.find(Imagenes.class, id);
    } 
}
