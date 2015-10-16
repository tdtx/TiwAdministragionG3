package dominio;

public class uRegistrado {
	String nick;
	String nombre;
	String apellido1;
	String apellido2;
	String correo;
	String clave;
	String fechaNc;
	public uRegistrado() {
		super();
	}
	public uRegistrado(String nick, String nombre, String apellido1,
			String apellido2, String correo, String clave, String fechaNc) {
		super();
		this.nick = nick;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.correo = correo;
		this.clave = clave;
		this.fechaNc = fechaNc;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
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
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getFechaNc() {
		return fechaNc;
	}
	public void setFechaNc(String fechaNc) {
		this.fechaNc = fechaNc;
	}
}
