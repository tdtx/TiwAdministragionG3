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
								<c:forEach items="${registrados }" var="registrado">
									<tr>
										<td>${registrado.nick}</td>
										<td>${registrado.nombre}</td>
										<td>${registrado.apellido1}</td>
										<td>${registrado.correo}</td>
										<td class="text-center">
											<button class="btn btn-info btn-xs" data-toggle="modal"
												data-toggle="tooltip" data-placement="left"
												title="Editar Registrado" data-target="#miDialog">
												<span class="glyphicon glyphicon-pencil"></span>
											</button> <a class="btn btn-danger btn-xs" data-toggle="modal tooltip"
											data-placement="left" title="Eliminar Registrado" href="#">
												<span class="glyphicon glyphicon-trash"></span>
										</a>
										</td>
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
														Registrado de ${registrado.correo}</h4>
												</div>
												<div class="modal-body">
													<div class="">
														<form action="gestionRegistrado" method="post"
															class="form-horizontal" role="form">
															<input type="text" name="id" value="${registrado.correo}"
																style="display: none">
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="nick">Nick </label> <input type="text"
																		class="form-control" id="nick" name="nick"
																		value="${registrado.nick}">
																</div>
																<div class="form-group col-md-5">
																	<label for="nombreR">Nombre</label> <input
																		type="text" class="form-control" id="nombreR"
																		name="nombreR" 
																		value="${registrado.nombre}">
																</div>
															</div>
															<br>
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="apellido1R">Apellido 1 </label> <input type="text"
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
																	<label for="correoR">Correo </label> <input type="text"
																		class="form-control" id="correoR" name="correoR"
																		value="${registrado.correo}">
																</div>
																<div class="form-group col-md-5">
																	<label for="fechaNcR">Fecha de nacimiento</label> <input
																		type="text" class="form-control" id="fechaNcR"
																		name="fechaNcR" 
																		value="${registrado.fechaNc}">
																</div>
															</div>
															<br>
															
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