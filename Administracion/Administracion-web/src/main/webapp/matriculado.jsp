<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<script src="js/validarMatriculado.js"></script>
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
										<th>Curso</th>
										<th>Alumno</th>
										<th>Precio</th>
										<th class="text-center">Opciones</th>
										
									</tr>
								</thead>
								<tbody>
                               <c:forEach items="${matriculados }" var="matriculado">
                                    <tr>
                                        <td>${matriculado.curso}</td>
                                        <td>${matriculado.usuario}</td>
                                        <td>${matriculado.precio}</td> 
                                          <td class="text-center">
                                         <button class="btn btn-info btn-xs" data-toggle="modal" data-toggle="tooltip" data-placement="left" title="Editar Matriculado" data-target="#miDialog${matriculado.curso}${matriculado.usuario}">
                                                <span class="glyphicon glyphicon-pencil"></span>
                                        </button>
                                        <a class="btn btn-danger btn-xs" data-toggle="modal tooltip" data-placement="left" title="Eliminar Matriculado" href="gestionMatriculado?accion=eliminarM&curso=${matriculado.curso}&user=${matriculado.usuario}"> <span class="glyphicon glyphicon-trash"></span></a></td>
                                    </tr>
                                    <div class="modal fade" id="miDialog${matriculado.curso}${matriculado.usuario}" tabindex="-1"
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
														Matriculado del curso ${matriculado.curso} y alumno ${matriculado.usuario} </h4>
												</div>
												<div class="modal-body">
													<div class="">
														<form onSubmit="return validarM(this)" action="gestionMatriculado" method="post"
															class="form-horizontal" role="form">
															<input type="text" name="id" value="${matriculado.curso}${matriculado.usuario}"
																style="display: none">																	
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="cursoM">Curso </label> <span class="red">*</span><input type="text"
																		class="form-control" id="cursoM" name="cursoM"
																		value="${matriculado.curso}">
																</div>
																		<div class="form-group col-md-5">
																	<label for="usuarioM">Alumno</label> <span class="red">*</span><input
																		type="text" class="form-control" id="usuarioM"
																		name="usuarioM" 
																		value="${matriculado.usuario}">
																</div>
															</div>									
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="precio_finalM">Precio </label> <span class="red">*</span><input type="text"
																		class="form-control" id="precio_finalM" name="precio_finalM"
																		value="${matriculado.precio_final}">
																</div>
																<div class="form-group col-md-5">
																	<label for="notaM">Nota</label> <span class="red">*</span><input
																		type="text" class="form-control" id="notaM"
																		name="notaM" 
																		value="${matriculado.nota}">
																</div>
															</div>
								
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="cuponM">Cupon </label> <span class="red">*</span><input type="text"
																		class="form-control" id="cuponM" name="cuponM"
																		value="${matriculado.cupon}">
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
														</form>
													</div>
												</div>
												
											</div>
										</div>
									</div>
                                    </c:forEach>
                                   <tbody>
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