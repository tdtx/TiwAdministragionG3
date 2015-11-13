package AdministracionG3.model.dominios;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class resultadosPruebas implements Serializable{
	
private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;
	@Column(unique = true, nullable = false)
	long id_prueba;
	@Column(unique = true, nullable = false)
	String id_matricula;
	double nota;
	@Column(unique = false, nullable = true)
	String comentario;
	
	
	public resultadosPruebas() {
		super();
	}
	
	
	public resultadosPruebas(Long id, long id_prueba, String id_matricula,
			double nota, String comentario) {
		super();
		this.id = id;
		this.id_prueba = id_prueba;
		this.id_matricula = id_matricula;
		this.nota = nota;
		this.comentario = comentario;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public long getId_prueba() {
		return id_prueba;
	}
	public void setId_prueba(long id_prueba) {
		this.id_prueba = id_prueba;
	}
	public String getId_matricula() {
		return id_matricula;
	}
	public void setId_matricula(String id_matricula) {
		this.id_matricula = id_matricula;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
