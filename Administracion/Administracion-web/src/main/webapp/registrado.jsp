<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>

<head>

<script src="js/modifReg.js"></script>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div id="wrapper">
		<div id="page-wrapper">
			<div class="container-fluid">
				<!-- Page Heading -->
				<div class="row">
					<div class="col-lg-12 ">
						<h1 class="page-header">Registrados</h1>
						<div class="table-responsive panel panel-default">
							<table class="table table-hover">
								<thead>
									<tr>
										<th>Nick</th>
										<th>Nombre</th>
										<th>Apellido</th>
										<th>Correo</th>
										<th class="text-center">Opciones</th>

									</tr>
								</thead>
									<tbody>
								<c:forEach items="${registrados }" var="registrado">
									<tr>
										<td>${registrado.nick}</td>
										<td>${registrado.nombre}</td>
										<td>${registrado.apellido1}</td>
										<td>${registrado.correo}</td>
										<td class="text-center">
											<button class="btn btn-info btn-xs" data-toggle="modal"
												data-toggle="tooltip" data-placement="left"
												title="Editar Registrado" data-target="#myModal${registrado.nick}">							
												<span class="glyphicon glyphicon-pencil"></span>
											</button> <a class="btn btn-danger btn-xs" data-toggle="modal tooltip"
											data-placement="left" title="Eliminar Registrado"  href="gestionRegistrado?accion=eliminarR&nick=${registrado.nick}">
												<span class="glyphicon glyphicon-trash"></span>
										</a>
										</td>
									</tr>
									<div class="modal fade" id="myModal${registrado.nick}" tabindex="-1"
										role="dialog" aria-labelledby="myModalLabel"
										aria-hidden="true">
										<div class="modal-dialog">
											<div class="modal-content">
												<div class="modal-header">
													<button type="button" class="close" data-dismiss="modal">
														<span aria-hidden="true">&times;</span><span
															class="sr-only">Close</span>
													</button>
													<h4 class="modal-title" id="myModalLabel">Editar
														Registrado de ${registrado.correo}</h4>
												</div>
												<div class="modal-body">
													<div class="">
	<!---Form Registrado --------------------------><form  onSubmit="return validarRegistrado(this)" action="gestionRegistrado" method="post"
															class="form-horizontal" role="form">
															<input type="text" name="id" value="${registrado.correo}"
																style="display: none">
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="idR">ID </label> <input type="text"
																		class="form-control" id="idR" name="idR"
																		value="${registrado.id}" readonly>
																</div>
																<div class="form-group col-md-5">
																	
																</div>
															</div>
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="nickR">Nick </label> <span class="red">*</span> <input type="text"
																		class="form-control" id="nickR" name="nickR"
																		value="${registrado.nick}">
																</div>
																<div class="form-group col-md-5">
																	<label for="nombreR">Nombre</label> <span class="red">*</span><input
																		type="text" class="form-control" id="nombreR"
																		name="nombreR" 
																		value="${registrado.nombre}">
																</div>
															</div>
															<br>
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="apellido1R">Apellido 1 </label> <span class="red">*</span><input type="text"
																		class="form-control" id="apellido1R" name="apellido1R"
																		value="${registrado.apellido1}">
																</div>
																<div class="form-group col-md-5">
																	<label for="apellido2R">Apellido 2</label> <input
																		type="text" class="form-control" id="apellido2R"
																		name="apellido2R" 
																		value="${registrado.apellido2}">
																</div>
															</div>
															<br>
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="correoR">Correo </label> <span class="red">*</span><input type="text"
																		class="form-control" id="correoR" name="correoR"
																		value="${registrado.correo}">
																</div>
																<div class="form-group col-md-5">
																	<label for="fechaNcR">Fecha de nacimiento</label> <span class="red">*</span><input
																		type="text" class="form-control" id="fechaNcR"
																		name="fechaNcR" readonly
																		value="${registrado.fechanac}">
																</div>
															</div>
															<br>
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	
																	<label id="txtDif" for="rolR">Rol de usuario</label>
																		<select id="rolR" name="rolR" class="form-control">
																			<option value="${registrado.rol}">${registrado.rol}</option>
																			<option value="Alumno">Alumno</option>
																			<option value="estudiante">Estudiante</option>
																			<option value="profesor">Profesor</option>
											
																		</select>
														<div>  &nbsp</div>
			
																		 <label for="dniR">DNI </label> <input type="text"
																		class="form-control" id="dniR" name="dniR"
																		value="${registrado.dni}"> 
																</div>
												
																<div class="text-center">
																<img alt="fotoUsuario" src="${registrado.idImagen}">
																	</div>
															</div>
															<br>
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="descripcionR">Descripcion </label> <input type="text"
																		class="form-control" id="descripcionR" name="descripcionR"
																		value="${registrado.descripcion}">
																</div>
																<div class="form-group col-md-5">
																	<label for="aficionesR">Aficiones</label><input
																		type="text" class="form-control" id="aficionesR"
																		name="aficionesR" 
																		value="${registrado.aficiones}">
																</div>
															</div>
															<br>
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label id="txtDif" for="generoR">Genero</label>
																		<select id="generoR" name="generoR" class="form-control">
																			<option value="${registrado.genero}">${registrado.genero}</option>
																			<option value="hombre">Hombre</option>
																			<option value="mujer">Mujer</option>							
																		</select>
																</div>
																<div class="form-group col-md-5">
																	<label for="tarjetaR">Trajeta de credito</label><input
																		type="text" class="form-control" id="tarjetaR"
																		name="tarjetaR" 
																		value="${registrado.tarjeta}">
																</div>
															</div>
															<br>
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="calleR">Calle </label> <input type="text"
																		class="form-control" id="calleR" name="calleR"
																		value="${registrado.calle}">
																</div>
																<div class="form-group col-md-5">
																	<label for="localidadR">Localidad</label><input
																		type="text" class="form-control" id="localidadR"
																		name="localidadR" 
																		value="${registrado.localidad}">
																</div>
															</div>
															<br>
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="codigoPostalR">Codigo postal </label> <input type="text"
																		class="form-control" id="codigoPostalR" name="codigoPostalR"
																		value="${registrado.codigoPostal}">
																</div>
																<div class="form-group col-md-5">
																	<label for="provinciaR">Provincia</label><input
																		type="text" class="form-control" id="provinciaR"
																		name="provinciaR" 
																		value="${registrado.provincia}">
																</div>
															</div>
															<br>
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="telefonoR">Telefono de contacto</label> <input type="text"
																		class="form-control" id="telefonoR" name="telefonoR"
																		value="${registrado.telefono}">
																</div>
															
															</div>
															<br>
															<div class="modal-footer">
													<div>
																<button type="submit" class="btn btn-primary">Guardar
																	Cambios</button>
																<button type="button" class="btn btn-primary"
																	data-dismiss="modal">Cerrar</button>
															</div>								
												</div>
														</form>
													</div>
												</div>
												
											</div>
										</div>
									</div>
								</c:forEach>
									</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>




