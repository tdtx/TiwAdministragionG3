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
public class Matriculados implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;
	@Column(unique = true, nullable = false)
	String id_curso;
	@Column(unique = true, nullable = false)
	String id_usuario;
	@Column(unique = true, nullable = false)
	String cupon;
	double precio_final;
	double nota;
	
	 @OneToMany(fetch = LAZY, cascade = ALL)
	    private  ResultadosPruebas rescultadosPruebas;
	
	
	public Matriculados() {
		super();
	}
	
	
	public Matriculados(Long id, String id_curso, String id_usuario,
			String cupon, double precio_final, double nota) {
		super();
		this.id = id;
		this.id_curso = id_curso;
		this.id_usuario = id_usuario;
		this.cupon = cupon;
		this.precio_final = precio_final;
		this.nota = nota;
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
	public String getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getCupon() {
		return cupon;
	}
	public void setCupon(String cupon) {
		this.cupon = cupon;
	}
	public double getPrecio_final() {
		return precio_final;
	}
	public void setPrecio_final(double precio_final) {
		this.precio_final = precio_final;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
