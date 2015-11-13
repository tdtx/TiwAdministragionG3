package AdministracionG3.model.daos;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.transaction.UserTransaction;
import javax.persistence.Query;
import AdministracionG3.model.dominios.usuarios;

import java.util.List;

public class usuarioDAO {
    private final EntityManager em;
    private final UserTransaction ut;

    public usuarioDAO(EntityManager em, UserTransaction ut) {
        super();
        this.em = em;
        this.ut = ut;
    }

    public usuarios guardarUsuario(usuarios nuevoUsuario) throws Exception{
        ut.begin();    
        em.persist(nuevoUsuario); 
        ut.commit();   
        return nuevoUsuario;
    }
    public usuarios actualizarUsuario(usuarios usuario) throws Exception{
        ut.begin();
        em.merge(usuario);
        ut.commit();
        return usuario;
    }
    
    public void borrarUsuario(usuarios usuario)throws Exception{
        ut.begin();
        em.remove(em.merge(usuario));
        ut.commit();
    }
    
     public usuarios comprobarLogin(String email, String password)throws NoResultException{
        return em.createQuery("select u from Cliente u where u.email='"+email+"' and u.password='"+password+"'",usuarios.class).getSingleResult();
     }
     
    public usuarios buscarCliente(Long id) {
        return em.find(usuarios.class, id);
    } 
}
