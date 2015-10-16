package dominio;

public class uMarculado {
	String nick;
	String nombre;
	String apellido1;
	String apellido2;
	String correo;
	String clave;
	String fechaNc;
	int telefono;
	String genero;
	String calle;
	String localidad;
	int cp;
	String provincia;
	String pais;
	String img;
	String dni;
	String cupon;
	String precio;
	String logro;
	String cursos;
	public uMarculado() {
		super();
	}
	public uMarculado(String nick, String nombre, String apellido1,
			String apellido2, String correo, String clave, String fechaNc,
			int telefono, String genero, String calle, String localidad,
			int cp, String provincia, String pais, String img, String dni,
			String cupon, String precio, String logro, String cursos) {
		super();
		this.nick = nick;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.correo = correo;
		this.clave = clave;
		this.fechaNc = fechaNc;
		this.telefono = telefono;
		this.genero = genero;
		this.calle = calle;
		this.localidad = localidad;
		this.cp = cp;
		this.provincia = provincia;
		this.pais = pais;
		this.img = img;
		this.dni = dni;
		this.cupon = cupon;
		this.precio = precio;
		this.logro = logro;
		this.cursos = cursos;
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
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
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
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getCupon() {
		return cupon;
	}
	public void setCupon(String cupon) {
		this.cupon = cupon;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getLogro() {
		return logro;
	}
	public void setLogro(String logro) {
		this.logro = logro;
	}
	public String getCursos() {
		return cursos;
	}
	public void setCursos(String cursos) {
		this.cursos = cursos;
	}
}
