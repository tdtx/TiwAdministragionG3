package AdministracionG3.model.daos;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.transaction.UserTransaction;
import javax.persistence.Query;

import AdministracionG3.model.dominios.Usuarios;

import java.sql.SQLException;
import java.util.List;

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
    
    
    //para hacer login
    public Usuarios buscarLogin(String correo, String clave) {
		
		Query query =  em.createQuery("SELECT u FROM Usuarios u where u.correo=:correo and u.clave=:clave", Usuarios.class);
		query.setParameter("correo", correo);
		query.setParameter("clave", clave);
		List resultList = query.getResultList();
		if (resultList.isEmpty()) {
			return null;
		}else{
		
			return (Usuarios) query.getSingleResult();
		}
		
	}
    
    
    //cambiar clave
    public Usuarios actualizarClave(String nick, String clave) {
		
		Query query =  em.createQuery("SELECT u FROM Usuarios u where u.nick=:nick and u.clave=:clave", Usuarios.class);
		query.setParameter("nick", nick);
		query.setParameter("clave", clave);
		List resultList = query.getResultList();
		if (resultList.isEmpty()) {
			return null;
		}else{
		
			return (Usuarios) query.getSingleResult();
		}
		
	}
    
    
    
    //buscar por nick
	public Usuarios buscarNick(String nick) {
			
			Query query =  em.createQuery("SELECT u FROM Usuarios u where u.nick=:nick", Usuarios.class);
			query.setParameter("nick", nick);
			List resultList = query.getResultList();
			if (resultList.isEmpty()) {
				return null;
			}else{
			
				return (Usuarios) query.getSingleResult();
			}
			
		}

	public List<Usuarios> buscarUsuarios() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		List<Usuarios> listaUsuarios = em.createQuery("SELECT u from Usuarios u",Usuarios.class).getResultList();		
		return listaUsuarios;
	}
     

}
