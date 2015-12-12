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
	String curso;
	String usuario;
	String cupon;
	double precio_final;
	double nota;
	
	/* @ManyToOne(fetch = LAZY, cascade = ALL)
	 	private Usuarios usuarios;
	
	 @OneToMany(fetch = LAZY, cascade = ALL)
	    private  List <ResultadosPruebas> resultadosPruebas;
	 
	 @ManyToOne(fetch = LAZY, cascade = ALL)
	 	private Curso curso;*/
	
	
	
	
	
	public Matriculados() {
		super();
	}
	
	
	public Matriculados(String curso, String usuario,
			String cupon, double precio_final, double nota) {
		super();
		this.curso = curso;
		this.usuario = usuario;
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
	
	

	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
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
