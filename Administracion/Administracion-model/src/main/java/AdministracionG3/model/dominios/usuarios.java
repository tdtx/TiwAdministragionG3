package AdministracionG3.model.dominios;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.AUTO;
import javax.persistence.Id;

@Entity
public class usuarios implements Serializable {		
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;
	String rol;
	@Column(unique = true, nullable = false)
	String nick;
	String clave;
	String nombre;
	String apellido1;
	@Column(unique = false, nullable = true)
	String apellido2;
	int telefono;
	@Column(unique = true, nullable = false)
	String email;
	String cuentaBancaria;
	String idImagen;
	String fechaNacimiento;
	String descripcion;
	String aficiones;
	
	public usuarios() {
		super();
	}
//para el registro	
	public usuarios(String nick, String clave, String nombre, String apellido1,
			String apellido2, String email, String fechaNacimiento) {
		super();
		this.nick = nick;
		this.clave = clave;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
	}
//para login	
	public usuarios(String clave, String email) {
		super();
		this.clave = clave;
		this.email = email;
	}
//para perfil	
	public Long getId() {
		return id;
	}
	public usuarios(Long id, String rol, String nick, String clave, String nombre,
		String apellido1, String apellido2, int telefono, String email,
		String cuentaBancaria, String idImagen, String fechaNacimiento,
		String descripcion, String aficiones) {
	super();
		this.id = id;
		this.rol = rol;
		this.nick = nick;
		this.clave = clave;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.telefono = telefono;
		this.email = email;
		this.cuentaBancaria = cuentaBancaria;
		this.idImagen = idImagen;
		this.fechaNacimiento = fechaNacimiento;
		this.descripcion = descripcion;
		this.aficiones = aficiones;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCuentaBancaria() {
		return cuentaBancaria;
	}
	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	public String getIdImagen() {
		return idImagen;
	}
	public void setIdImagen(String idImagen) {
		this.idImagen = idImagen;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getAficiones() {
		return aficiones;
	}
	public void setAficiones(String aficiones) {
		this.aficiones = aficiones;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}