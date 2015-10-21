package dominio;

public class crearCurso {
	int id;
	String titulo;
	String descripcion;
	String nHoras;
	String temario;
	String profesor;
	String certificado;
	String secciones;
	String lecciones;
	String material;
	String notificaciones;
	String calificaciones;
	String categoria;
	String destacado;
	String validado;
	String precio;
	String tOferta;
	String img;
	String dificultad;
	String fechaIni;
	String fechaFIn;
	String asociado;
	String cierreCurso;
	String peticionE;
	public crearCurso() {
		super();
	}
	
	public crearCurso(int id, String titulo, String descripcion, String nHoras,
			String temario, String profesor, String certificado,
			String secciones, String lecciones, String material,
			String notificaciones, String calificaciones, String categoria,
			String destacado, String validado, String precio, String tOferta,
			String dificultad, String fechaIni, String fechaFIn,
			String asociado, String cierreCurso, String peticionE) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.nHoras = nHoras;
		this.temario = temario;
		this.profesor = profesor;
		this.certificado = certificado;
		this.secciones = secciones;
		this.lecciones = lecciones;
		this.material = material;
		this.notificaciones = notificaciones;
		this.calificaciones = calificaciones;
		this.categoria = categoria;
		this.destacado = destacado;
		this.validado = validado;
		this.precio = precio;
		this.tOferta = tOferta;
		this.dificultad = dificultad;
		this.fechaIni = fechaIni;
		this.fechaFIn = fechaFIn;
		this.asociado = asociado;
		this.cierreCurso = cierreCurso;
		this.peticionE = peticionE;
	}

	public crearCurso(int id, String titulo, String descripcion, String nHoras,
			String temario, String profesor, String certificado,
			String secciones, String lecciones, String material,
			String notificaciones, String calificaciones, String categoria,
			String destacado, String validado, String precio, String tOferta,
			String img, String dificultad, String fechaIni, String fechaFIn,
			String asociado, String cierreCurso, String peticionE) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.nHoras = nHoras;
		this.temario = temario;
		this.profesor = profesor;
		this.certificado = certificado;
		this.secciones = secciones;
		this.lecciones = lecciones;
		this.material = material;
		this.notificaciones = notificaciones;
		this.calificaciones = calificaciones;
		this.categoria = categoria;
		this.destacado = destacado;
		this.validado = validado;
		this.precio = precio;
		this.tOferta = tOferta;
		this.img = img;
		this.dificultad = dificultad;
		this.fechaIni = fechaIni;
		this.fechaFIn = fechaFIn;
		this.asociado = asociado;
		this.cierreCurso = cierreCurso;
		this.peticionE = peticionE;
	}

	public String getPeticionE() {
		return peticionE;
	}

	public void setPeticionE(String peticionE) {
		this.peticionE = peticionE;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getnHoras() {
		return nHoras;
	}
	public void setnHoras(String nHoras) {
		this.nHoras = nHoras;
	}
	public String getTemario() {
		return temario;
	}
	public void setTemario(String temario) {
		this.temario = temario;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	public String getCertificado() {
		return certificado;
	}
	public void setCertificado(String certificado) {
		this.certificado = certificado;
	}
	public String getSecciones() {
		return secciones;
	}
	public void setSecciones(String secciones) {
		this.secciones = secciones;
	}
	public String getLecciones() {
		return lecciones;
	}
	public void setLecciones(String lecciones) {
		this.lecciones = lecciones;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getNotificaciones() {
		return notificaciones;
	}
	public void setNotificaciones(String notificaciones) {
		this.notificaciones = notificaciones;
	}
	public String getCalificaciones() {
		return calificaciones;
	}
	public void setCalificaciones(String calificaciones) {
		this.calificaciones = calificaciones;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDestacado() {
		return destacado;
	}
	public void setDestacado(String destacado) {
		this.destacado = destacado;
	}
	public String getValidado() {
		return validado;
	}
	public void setValidado(String validado) {
		this.validado = validado;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String gettOferta() {
		return tOferta;
	}
	public void settOferta(String tOferta) {
		this.tOferta = tOferta;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getDificultad() {
		return dificultad;
	}
	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}
	public String getFechaIni() {
		return fechaIni;
	}
	public void setFechaIni(String fechaIni) {
		this.fechaIni = fechaIni;
	}
	public String getFechaFIn() {
		return fechaFIn;
	}
	public void setFechaFIn(String fechaFIn) {
		this.fechaFIn = fechaFIn;
	}
	public String getAsociado() {
		return asociado;
	}
	public void setAsociado(String asociado) {
		this.asociado = asociado;
	}
	public String getCierreCurso() {
		return cierreCurso;
	}
	public void setCierreCurso(String cierreCurso) {
		this.cierreCurso = cierreCurso;
	}
}
