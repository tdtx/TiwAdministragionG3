package AdministracionG3.model.dominios;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.AUTO;

@Entity
public class Pruebas implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;
	@Column(unique = true, nullable = false)
	String id_curso;
	@Column(unique = false, nullable = true)
	String descripcion;
	
	
	/*
	 @OneToMany(fetch = LAZY, cascade = ALL)
	    private  ResultadosPruebas rescultadosPruebas;
	
	*/
	
	
	
	public Pruebas() {
		super();
	}
	
	
	public Pruebas(Long id, String id_curso, String descripcion) {
		super();
		this.id = id;
		this.id_curso = id_curso;
		this.descripcion = descripcion;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getId_curso() {
		return id_curso;
	}
	public void setId_curso(String id_curso) {
		this.id_curso = id_curso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		
	
	
	
}
