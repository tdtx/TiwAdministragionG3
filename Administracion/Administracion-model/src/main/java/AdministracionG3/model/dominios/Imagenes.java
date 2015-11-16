package AdministracionG3.model.dominios;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.AUTO;

@Entity
public class Imagenes  implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;
	String imagen;
	
	

	 @OneToMany(fetch = LAZY, cascade = ALL)
	    private  Usuarios usuarios;
	 
	 @OneToMany(fetch = LAZY, cascade = ALL)
	    private Curso curso;
	
	
	public Imagenes() {
		super();
	}
	
	public Imagenes(Long id, String imagen) {
		super();
		this.id = id;
		this.imagen = imagen;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}