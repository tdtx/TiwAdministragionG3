package AdministracionG3.model.daos;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.transaction.UserTransaction;
import javax.persistence.Query;
import AdministracionG3.model.dominios.Usuarios;

public class UsuarioDAO {
    private final EntityManager em;
    private final UserTransaction ut;

    public UsuarioDAO(EntityManager em, UserTransaction ut) {
        super();
        this.em = em;
        this.ut = ut;
    }

    public Usuarios guardarUsuario(Usuarios nuevoUsuario) throws Exception{
        ut.begin();    
        em.persist(nuevoUsuario); 
        ut.commit();   
        return nuevoUsuario;
    }
    public Usuarios actualizarUsuario(Usuarios usuario) throws Exception{
        ut.begin();
        em.merge(usuario);
        ut.commit();
        return usuario;
    }
    
    public void borrarUsuario(Usuarios usuario)throws Exception{
        ut.begin();
        em.remove(em.merge(usuario));
        ut.commit();
    }
    
     public Usuarios comprobarLogin(String email, String password)throws NoResultException{
       // return em.createQuery("select u from Cliente u where u.email='"+email+"' and u.password='"+password+"'",usuarios.class).getSingleResult();
     
        Query query = em.createQuery("select u from Cliente u where u.email=:email and u.password=:password",Usuarios.class);
        query.setParameter("email", email);
        query.setParameter("password", password);
        return (Usuarios) query.getSingleResult();
        /*
         * Query query =  em.createQuery("SELECT u FROM Usuario u where u.nick=:nick and u.password=:password", Usuario.class);
		query.setParameter("nick", user);
		query.setParameter("password", password);
		return (Usuario) query.getSingleResult();
         */
        
        
     }
     
    public Usuarios buscarCliente(Long id) {
        return em.find(Usuarios.class, id);
    } 
}
