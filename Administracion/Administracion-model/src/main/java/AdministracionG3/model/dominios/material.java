package AdministracionG3.model.dominios;

import static javax.persistence.GenerationType.AUTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class material implements Serializable {		
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;
	@Column(unique = true, nullable = false)
	String idLeccion;
	String nombre;
	String documento;
	
	public material() {
		super();
	}
	public material(Long id, String idLeccion, String nombre, String documento) {
		super();
		this.id = id;
		this.idLeccion = idLeccion;
		this.nombre = nombre;
		this.documento = documento;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdLeccion() {
		return idLeccion;
	}
	public void setIdLeccion(String idLeccion) {
		this.idLeccion = idLeccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
