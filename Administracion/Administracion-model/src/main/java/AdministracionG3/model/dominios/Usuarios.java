package AdministracionG3.model.dominios;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.AUTO;

import javax.persistence.Id;

@Entity
public class Usuarios implements Serializable {		
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = AUTO)
	private Long id;
	@Column(unique = true, nullable = false)
	
	//registrado
		String nick;
		String clave;
		String nombre;
		String apellido1;
		@Column(unique = false, nullable = true)
		String apellido2;
		String fechanac;
		@Column(unique = true, nullable = false)
		String correo;
		
		//matriculado
		@Column(unique = false, nullable = true)
		String tarjeta;
		@Column(unique = false, nullable = true)
		String idImagen;
		@Column(unique = false, nullable = true)
		String descripcion;
		@Column(unique = false, nullable = true)
		String aficiones;
		@Column(unique = false, nullable = true)
		String calle;
		@Column(unique = false, nullable = true)
		String localidad;
		@Column(unique = false, nullable = true)
		int codigoPostal;
		@Column(unique = false, nullable = true)
		String provincia;
		@Column(unique = false, nullable = true)
		int telefono;
		@Column(unique = false, nullable = true)
		String rol;
		@Column(unique = false, nullable = true)
		String dni;
		@Column(unique = false, nullable = true)
		String genero;


		/*
		@OneToMany(fetch = LAZY, cascade = ALL)
	    private  Matriculados matriculados;
		
		*/
		public Usuarios() {
			super();
		}
	//para el registro	
		public Usuarios(String nick, String clave, String nombre, String apellido1,
				String apellido2, String correo, String fechanac, String rol) {
			super();
			this.nick = nick;
			this.clave = clave;
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
			this.correo = correo;
			this.fechanac = fechanac;
			this.rol=rol;
		}
	//para login	
		public Usuarios(String clave, String correo) {
			super();
			this.clave = clave;
			this.correo = correo;
		}
	//para perfil

		
		public Usuarios(String nick, String clave, String nombre,
				String apellido1, String apellido2, String fechanac, String correo,
				String tarjeta, String idImagen, String calle, String localidad,
				int codigoPostal, String provincia, int telefono, String rol,
				String dni, String genero) {
			super();
			this.nick = nick;
			this.clave = clave;
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
			this.fechanac = fechanac;
			this.correo = correo;
			this.tarjeta = tarjeta;
			this.idImagen = idImagen;
			this.calle = calle;
			this.localidad = localidad;
			this.codigoPostal = codigoPostal;
			this.provincia = provincia;
			this.telefono = telefono;
			this.rol = rol;
			this.dni = dni;
			this.genero = genero;
		}
		
		
		
		
		public Usuarios(String nick, String clave, String nombre,
				String apellido1, String apellido2, String fechanac, String correo,
				String tarjeta, String idImagen, String descripcion,
				String aficiones, String calle, String localidad, int codigoPostal,
				String provincia, int telefono, String rol, String dni,
				String genero) {
			super();
			this.nick = nick;
			this.clave = clave;
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
			this.fechanac = fechanac;
			this.correo = correo;
			this.tarjeta = tarjeta;
			this.idImagen = idImagen;
			this.descripcion = descripcion;
			this.aficiones = aficiones;
			this.calle = calle;
			this.localidad = localidad;
			this.codigoPostal = codigoPostal;
			this.provincia = provincia;
			this.telefono = telefono;
			this.rol = rol;
			this.dni = dni;
			this.genero = genero;
		}
		
		//para editar perfil
		
		public Usuarios(String nick, String nombre, String apellido1,
				String apellido2, String correo, String descripcion,
				String aficiones) {
			super();
			this.nick = nick;
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
			this.correo = correo;
			this.descripcion = descripcion;
			this.aficiones = aficiones;
		}
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
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
		public String getFechanac() {
			return fechanac;
		}
		public void setFechanac(String fechanac) {
			this.fechanac = fechanac;
		}
		public String getCorreo() {
			return correo;
		}
		public void setCorreo(String correo) {
			this.correo = correo;
		}
		public String getTarjeta() {
			return tarjeta;
		}
		public void setTarjeta(String tarjeta) {
			this.tarjeta = tarjeta;
		}
		public String getIdImagen() {
			return idImagen;
		}
		public void setIdImagen(String idImagen) {
			this.idImagen = idImagen;
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
		public String getCalle() {
			return calle;
		}
		public void setCalle(String calle) {
			this.calle = calle;
		}
		public String getLocalidad() {
			return localidad;
		}
		public void setLocalidad(String localidad) {
			this.localidad = localidad;
		}
		public int getCodigoPostal() {
			return codigoPostal;
		}
		public void setCodigoPostal(int codigoPostal) {
			this.codigoPostal = codigoPostal;
		}
		public String getProvincia() {
			return provincia;
		}
		public void setProvincia(String provincia) {
			this.provincia = provincia;
		}
		public int getTelefono() {
			return telefono;
		}
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}
		public String getRol() {
			return rol;
		}
		public void setRol(String rol) {
			this.rol = rol;
		}
		public String getDni() {
			return dni;
		}
		public void setDni(String dni) {
			this.dni = dni;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}


	
}