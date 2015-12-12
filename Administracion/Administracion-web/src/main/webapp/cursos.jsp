<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>
<head>
<script src="js/validarCurso.js"></script>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div id="wrapper">
		<div id="page-wrapper">
			<div class="container-fluid">
				<!-- Page Heading -->
				<div class="row">
					<div class="col-lg-12 ">
						<h1 class="page-header">Cursos</h1>
						<div class="table-responsive panel panel-default">
							<table class="table table-hover">
								<thead>
									<tr>
										<th>Titulo</th>
										<th>Profesor</th>
										<th>Validacion</th>
										<th>Eliminar</th>
										<th class="text-center">Opciones</th>

									</tr>
								</thead>
								<tbody>
                               <c:forEach items="${cursos }" var="curso">
                                    <tr>
                                        <td>${curso.titulo}</td>
                                        <td>${curso.usuario}</td>
                                         <td>${curso.validacion}</td>
                                         <td>${curso.fechaCaducidad}</td>  
                                          <td class="text-center">
                                         <button class="btn btn-info btn-xs" data-toggle="modal" data-toggle="tooltip" data-placement="left" title="Editar Curso" data-target="#miDialog${curso.id}">
                                                <span class="glyphicon glyphicon-pencil"></span>
                                        </button>
                                        <a class="btn btn-danger btn-xs" data-toggle="modal tooltip" data-placement="left" title="Eliminar Curso" href="gestionCurso?accion=eliminarC&titulo=${curso.titulo}"> <span class="glyphicon glyphicon-trash"></span></a></td>
                                    </tr>
                                     <div class="modal fade" id="miDialog${curso.id}" tabindex="-1"
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
														Curso de ${curso.titulo}</h4>
												</div>
												<div class="modal-body">
													<div class="">
														<form onSubmit="return validarC(this)" action="gestionCurso" method="post"
															class="form-horizontal" role="form">
															<input type="text" name="id" value="${curso.titulo}"
																style="display: none">																	
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																
																<label for="tituloC">Titulo</label> <span class="red">*</span><input
																		type="text" class="form-control" id="tituloC"
																		name="tituloC"
																		value="${curso.titulo}">																	
																<div>  &nbsp</div>
																	<label for="usuarioC">Profesor</label> <span class="red">*</span><input
																		type="text" class="form-control" id="usuarioC"
																		name="usuarioC" 
																		value="${curso.usuario}">
																</div>
												
																<div class="text-center">
																<img alt="fotoU" src="${curso.idImagen}">																		
																	</div>
															</div>
														
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="descripcionC">Descripcion </label> <span class="red">*</span><input type="text"
																		class="form-control" id="descripcionC" name="descripcionC"
																		value="${curso.descripcion}">
																</div>
																<div class="form-group col-md-5">
																	<label for="horasC">Numero de horas</label> <span class="red">*</span><input
																		type="text" class="form-control" id="horasC"
																		name="horasC"
																		value="${curso.horas}">
																</div>
															</div>
													
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="temarioC">Temario </label> <span class="red">*</span><input type="text"
																		class="form-control" id="temarioC" name="temarioC"
																		value="${curso.temario}">
																</div>
																<div class="form-group col-md-5">
																	<label for="certificadoC">Certificado </label> <span class="red">*</span><input type="text"
																		class="form-control" id="certificadoC" name="certificadoC"
																		value="${curso.certificado}">
																</div>
															</div>
												
											
										
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="categoriaC">Categoria </label> <span class="red">*</span><input type="text"
																		class="form-control" id="categoriaC" name="categoriaC"
																		value="${curso.categoria}">
																</div>
																<div class="form-group col-md-5">
																	<label for="destacadoC">Destacado</label> <span class="red">*</span><input
																		type="text" class="form-control" id="destacadoC"
																		name="destacadoC" 
																		value="${curso.destacado}">
																</div>
															</div>
													
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	 <label for="validacionC">Validacion </label> <span class="red">*</span><input type="text"
																		class="form-control" id="validacionC" name="validacionC"
																		value="${curso.validacion}"> 
																</div>
																<div class="form-group col-md-5">
																	<label for="precioC">Precio</label> <span class="red">*</span><input
																		type="text" class="form-control" id="precioC"
																		name="precioC" 
																		value="${curso.precio}">
																</div>
															</div>
										
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="tipoOfertaC">Tipo de oferta </label> <span class="red">*</span><input type="text"
																		class="form-control" id="tipoOfertaC" name="tipoOfertaC"
																		value="${curso.tipoOferta}">
																</div>
																<div class="form-group col-md-5">
																	<label for="nivelC">Dificultad</label> <span class="red">*</span><input
																		type="text" class="form-control" id="nivelC"
																		name="nivelC" 
																		value="${curso.nivel}">
																</div>
															</div>
													<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																 <label for="fechaInicioC">Fecha Inicial </label> <span class="red">*</span><input type="text"
																		class="form-control" id="fechaInicioC" name="fechaInicioC"
																		value="${curso.fechaInicio}"> 
																</div>
																<div class="form-group col-md-5">
																	<label for="fechaFInC">Fecha FIn</label> <span class="red">*</span><input
																		type="text" class="form-control" id="fechaCaducidadC"
																		name="fechaCaducidadC" 
																		value="${curso.fechaCaducidad}">
																</div>
															</div>
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																 <label for="descuentoCuponC">Fecha Inicial </label> <span class="red">*</span><input type="text"
																		class="form-control" id="descuentoCuponC" name="descuentoCuponC"
																		value="${curso.descuentoCupon}"> 
																</div>
															<div class="form-group col-md-5">
																	<label for="idC">ID</label> <span class="red">*</span><input
																		type="text" class="form-control" id="idC"
																		name="idC" readonly
																		value="${curso.id}">
																</div>
															</div>
														
													
														
																<div class="modal-footer">
													<div>
																<button type="submit" class="btn btn-primary" >Guardar
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