package AdministracionG3.model.dominios;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class imagenes  implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;
	String imagen;
	
	
	public imagenes() {
		super();
	}
	
	public imagenes(Long id, String imagen) {
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