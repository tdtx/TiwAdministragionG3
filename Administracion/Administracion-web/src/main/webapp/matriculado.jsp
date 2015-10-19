<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div id="wrapper">
		<div id="page-wrapper">
			<div class="container-fluid">
				<!-- Page Heading -->
				<div class="row">
					<div class="col-lg-12 ">
						<h1 class="page-header">Matriculados</h1>
						<div class="table-responsive panel panel-default">
							<table class="table table-hover">
								<thead>
									<tr>
										<th>Nombre</th>
										<th>Apellido</th>
										<th>DNI</th>
										<th>Correo</th>
										<th class="text-center">Opciones</th>
										
									</tr>
								</thead>
                               <c:forEach items="${matriculados }" var="matriculado">
                                    <tr>
                                        <td>${matriculado.nombre}</td>
                                        <td>${matriculado.apellido1}</td>
                                        <td>${matriculado.dni}</td>
                                        <td>${matriculado.correo}</td>  
                                          <td class="text-center">
                                         <button class="btn btn-info btn-xs" data-toggle="modal" data-toggle="tooltip" data-placement="left" title="Editar Matriculado" data-target="#miDialog">
                                                <span class="glyphicon glyphicon-pencil"></span>
                                        </button>
                                        <a class="btn btn-danger btn-xs" data-toggle="modal tooltip" data-placement="left" title="Eliminar Matriculado" href="login?accion=eliminarM&correo=${matriculado.correo}"> <span class="glyphicon glyphicon-trash"></span></a></td>
                                    </tr>
                                    <div class="modal fade" id="miDialog" tabindex="-1"
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
														Matriculado de ${matriculado.correo}</h4>
												</div>
												<div class="modal-body">
													<div class="">
														<form action="gestionMatriculado" method="post"
															class="form-horizontal" role="form">
															<input type="text" name="id" value="${matriculado.correo}"
																style="display: none">																	
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="nick">Nick </label> <input type="text"
																		class="form-control" id="nick" name="nick"
																		value="${matriculado.nick}">
														<div>  &nbsp</div>
																	<label for="nombreR">Nombre</label> <input
																		type="text" class="form-control" id="nombreR"
																		name="nombreR" 
																		value="${matriculado.nombre}">
																</div>
												
																<div class="text-center">
																<img alt="fotoU" src="${matriculado.img}">
																	</div>
															</div>
														
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="apellido1R">Apellido 1 </label> <input type="text"
																		class="form-control" id="apellido1R" name="apellido1R"
																		value="${matriculado.apellido1}">
																</div>
																<div class="form-group col-md-5">
																	<label for="apellido2R">Apellido 2</label> <input
																		type="text" class="form-control" id="apellido2R"
																		name="apellido2R" 
																		value="${matriculado.apellido2}">
																</div>
															</div>
													
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="correoR">Correo </label> <input type="text"
																		class="form-control" id="correoR" name="correoR"
																		value="${matriculado.correo}">
																</div>
																<div class="form-group col-md-5">
																	<label for="fechaNcR">Fecha de nacimiento</label> <input
																		type="text" class="form-control" id="fechaNcR"
																		name="fechaNcR" 
																		value="${matriculado.fechaNc}">
																</div>
															</div>
												
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="telefonoM">Telefono </label> <input type="text"
																		class="form-control" id="telefonoM" name="telefonoM"
																		value="${matriculado.telefono}">
																</div>
																<div class="form-group col-md-5">
																	<label for="generoM">Genero</label> <input
																		type="text" class="form-control" id="generoM"
																		name="generoM" 
																		value="${matriculado.genero}">
																</div>
															</div>
											
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="calleM">Calle </label> <input type="text"
																		class="form-control" id="calleM" name="calleM"
																		value="${matriculado.calle}">
																</div>
																<div class="form-group col-md-5">
																	<label for="localidadM">Localidad</label> <input
																		type="text" class="form-control" id="localidadM"
																		name="localidadM" 
																		value="${matriculado.localidad}">
																</div>
															</div>
											
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="cpM">Cp </label> <input type="text"
																		class="form-control" id="cpM" name="cpM"
																		value="${matriculado.cp}">
																</div>
																<div class="form-group col-md-5">
																	<label for="provinciaM">Provincia</label> <input
																		type="text" class="form-control" id="provinciaM"
																		name="provinciaM" 
																		value="${matriculado.provincia}">
																</div>
															</div>
													
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="paisM">Pais </label> <input type="text"
																		class="form-control" id="paisM" name="paisM"
																		value="${matriculado.pais}">
																</div>
																<div class="form-group col-md-5">
																	<label for="dniM">DNI</label> <input
																		type="text" class="form-control" id="dniM"
																		name="dniM" 
																		value="${matriculado.dni}">
																</div>
															</div>
													
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="cuponM ">Cupon </label> <input type="text"
																		class="form-control" id="cuponM" name="cuponM"
																		value="${matriculado.cupon}">
																</div>
																<div class="form-group col-md-5">
																	<label for="precioM">Precio</label> <input
																		type="text" class="form-control" id="precioM"
																		name="precioM" 
																		value="${matriculado.precio}">
																</div>
															</div>
										
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="logroM">Logro </label> <input type="text"
																		class="form-control" id="logroM" name="logroM"
																		value="${matriculado.logro}">
																</div>
																<div class="form-group col-md-5">
																	<label for="cursosM">Cursos</label> <input
																		type="text" class="form-control" id="cursosM"
																		name="cursosM" 
																		value="${matriculado.cursos}">
																</div>
															</div>
													
														</form>
													</div>
												</div>
												<div class="modal-footer">
													<div>
																<button type="submit" class="btn btn-primary">Guardar
																	Cambios</button>
																<button type="button" class="btn btn-primary"
																	data-dismiss="modal">Cerrar</button>
															</div>								
												</div>
											</div>
										</div>
									</div>
                                    </c:forEach>
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