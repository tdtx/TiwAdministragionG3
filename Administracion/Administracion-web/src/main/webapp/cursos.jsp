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
						<h1 class="page-header">Cursos</h1>
						<div class="table-responsive panel panel-default">
							<table class="table table-hover">
								<thead>
									<tr>
										<th>ID</th>
										<th>Titulo</th>
										<th>Profesor</th>
										<th>Validado</th>
										<th>Eliminar</th>
										<th class="text-center">Opciones</th>
										
									</tr>
								</thead>
                               <c:forEach items="${cursos }" var="curso">
                                    <tr>
                                        <td>${curso.id}</td>
                                        <td>${curso.titulo}</td>
                                        <td>${curso.profesor}</td>
                                        <td>${curso.validado}</td>  
                                         <td>${curso.peticionE}</td>  
                                          <td class="text-center">
                                         <button class="btn btn-info btn-xs" data-toggle="modal" data-toggle="tooltip" data-placement="left" title="Editar Curso" data-target="#miDialog">
                                                <span class="glyphicon glyphicon-pencil"></span>
                                        </button>
                                        <a class="btn btn-danger btn-xs" data-toggle="modal tooltip" data-placement="left" title="Eliminar Curso" href="gestionCurso?accion=eliminarC&titulo=${curso.titulo}"> <span class="glyphicon glyphicon-trash"></span></a></td>
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
														Curso de ${curso.titulo}</h4>
												</div>
												<div class="modal-body">
													<div class="">
														<form action="gestionCurso" method="post"
															class="form-horizontal" role="form">
															<input type="text" name="id" value="${curso.titulo}"
																style="display: none">																	
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="idC">ID </label> <input type="text"
																		class="form-control" id="idC" name="idC"
																		value="${curso.id}">
																	<div>  &nbsp</div>
																	<label for="tituloC">Titulo</label> <input
																		type="text" class="form-control" id="tituloC"
																		name="tituloC"
																		value="${curso.titulo}">
																</div>
												
																<div class="text-center">
																<img alt="fotoU" src="${curso.img}">
																	</div>
															</div>
														
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="descripcionC">Descripcion </label> <input type="text"
																		class="form-control" id="descripcionC" name="descripcionC"
																		value="${curso.descripcion}">
																</div>
																<div class="form-group col-md-5">
																	<label for="nHorasC">Numero de horas</label> <input
																		type="text" class="form-control" id="nHorasC"
																		name="nHorasC"
																		value="${curso.nHoras}">
																</div>
															</div>
													
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="temarioC">Temario </label> <input type="text"
																		class="form-control" id="temarioC" name="temarioC"
																		value="${curso.temario}">
																</div>
																<div class="form-group col-md-5">
																	<label for="profesorC">Profesor</label> <input
																		type="text" class="form-control" id="profesorC"
																		name="profesorC" 
																		value="${curso.profesor}">
																</div>
															</div>
												
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="certificadoC">Certificado </label> <input type="text"
																		class="form-control" id="certificadoC" name="certificadoC"
																		value="${curso.certificado}">
																</div>
																<div class="form-group col-md-5">
																	<label for="seccionesC">Secciones</label> <input
																		type="text" class="form-control" id="seccionesC"
																		name="seccionesC" 
																		value="${curso.secciones}">
																</div>
															</div>
											
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="leccionesC">Lecciones </label> <input type="text"
																		class="form-control" id="leccionesC" name="leccionesC"
																		value="${curso.lecciones}">
																</div>
																<div class="form-group col-md-5">
																	<label for="materialC">Material</label> <input
																		type="text" class="form-control" id="materialC"
																		name="materialC" 
																		value="${curso.material}">
																</div>
															</div>
											
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="notificacionesC">Notificaciones </label> <input type="text"
																		class="form-control" id="notificacionesC" name="notificacionesC"
																		value="${curso.notificaciones}">
																</div>
																<div class="form-group col-md-5">
																	<label for="calificacionesC">Calificaciones</label> <input
																		type="text" class="form-control" id="calificacionesC"
																		name="calificacionesC" 
																		value="${curso.calificaciones}">
																</div>
															</div>
													
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="categoriaC">Categoria </label> <input type="text"
																		class="form-control" id="categoriaC" name="categoriaC"
																		value="${curso.categoria}">
																</div>
																<div class="form-group col-md-5">
																	<label for="destacadoC">Destacado</label> <input
																		type="text" class="form-control" id="destacadoC"
																		name="destacadoC" 
																		value="${curso.destacado}">
																</div>
															</div>
													
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="validadoC">validadoalidado </label> <input type="text"
																		class="form-control" id="validadoC" name="validadoC"
																		value="${curso.validado}">
																</div>
																<div class="form-group col-md-5">
																	<label for="precioC">Precio</label> <input
																		type="text" class="form-control" id="precioC"
																		name="precioC" 
																		value="${curso.precio}">
																</div>
															</div>
										
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="tOfertaC">Tipo de oferta </label> <input type="text"
																		class="form-control" id="tOfertaC" name="tOfertaC"
																		value="${curso.tOferta}">
																</div>
																<div class="form-group col-md-5">
																	<label for="dificultadC">Dificultad</label> <input
																		type="text" class="form-control" id="dificultadC"
																		name="dificultadC" 
																		value="${curso.dificultad}">
																</div>
															</div>
													<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="fechaIniC">Fecha Inicial </label> <input type="text"
																		class="form-control" id="fechaIniC" name="fechaIniC"
																		value="${curso.fechaIni}">
																</div>
																<div class="form-group col-md-5">
																	<label for="fechaFInC">Fecha FIn</label> <input
																		type="text" class="form-control" id="fechaFInC"
																		name="fechaFInC" 
																		value="${curso.fechaFIn}">
																</div>
															</div>
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="asociadoC">Asociado</label> <input type="text"
																		class="form-control" id="asociadoC" name="asociadoC"
																		value="${curso.asociado}">
																</div>
																<div class="form-group col-md-5">
																	<label for="cierreCursoC">Cierre de Curso</label> <input
																		type="text" class="form-control" id="cierreCursoC"
																		name="cierreCursoC" 
																		value="${curso.cierreCurso}">
																</div>
															</div>
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="peticionEC">Peticion de Eliminar Curso</label> <input type="text"
																		class="form-control" id="peticionEC" name="peticionEC"
																		value="${curso.peticionE}">
																</div>
																</div>
														</form>
													</div>
												</div>
												<div class="modal-footer">
													<div>
																<button type="submit" class="btn btn-primary" data-dismiss="modal">Guardar
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