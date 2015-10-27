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
										<th>Nombre</th>
										<th>Apellido</th>
										<th>DNI</th>
										<th>Correo</th>
										<th class="text-center">Opciones</th>
										
									</tr>
								</thead>
								<tbody>
                               <c:forEach items="${matriculados }" var="matriculado">
                                    <tr>
                                        <td>${matriculado.nombre}</td>
                                        <td>${matriculado.apellido1}</td>
                                        <td>${matriculado.dni}</td>
                                        <td>${matriculado.correo}</td>  
                                          <td class="text-center">
                                         <button class="btn btn-info btn-xs" data-toggle="modal" data-toggle="tooltip" data-placement="left" title="Editar Matriculado" data-target="#miDialog${matriculado.dni}">
                                                <span class="glyphicon glyphicon-pencil"></span>
                                        </button>
                                        <a class="btn btn-danger btn-xs" data-toggle="modal tooltip" data-placement="left" title="Eliminar Matriculado" href="gestionMatriculado?accion=eliminarM&correo=${matriculado.correo}"> <span class="glyphicon glyphicon-trash"></span></a></td>
                                    </tr>
                                    <div class="modal fade" id="miDialog${matriculado.dni}" tabindex="-1"
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
														<form onSubmit="return validarM(this)" action="gestionMatriculado" method="post"
															class="form-horizontal" role="form">
															<input type="text" name="id" value="${matriculado.correo}"
																style="display: none">																	
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="nickM">Nick </label> <span class="red">*</span><input type="text"
																		class="form-control" id="nickM" name="nickM"
																		value="${matriculado.nick}">
														<div>  &nbsp</div>
																	<label for="nombreM">Nombre</label> <span class="red">*</span><input
																		type="text" class="form-control" id="nombreM"
																		name="nombreM" 
																		value="${matriculado.nombre}">
																</div>
												
																<div class="text-center">
																<img alt="fotoU" src="${matriculado.img}">
																	</div>
															</div>
														
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="apellido1M">Apellido 1 </label> <span class="red">*</span><input type="text"
																		class="form-control" id="apellido1M" name="apellido1M" 
																		value="${matriculado.apellido1}">
																</div>
																<div class="form-group col-md-5">
																	<label for="apellido2M">Apellido 2</label> <input
																		type="text" class="form-control" id="apellido2M"
																		name="apellido2M"  
																		value="${matriculado.apellido2}">
																</div>
															</div>
													
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="correoM">Correo </label> <span class="red">*</span><input type="text"
																		class="form-control" id="correoM" name="correoM" 
																		value="${matriculado.correo}"> 
																</div>
																<div class="form-group col-md-5">
																	<label for="fechaNcM">Fecha de nacimiento</label> <span class="red">*</span><input
																		type="text" class="form-control" id="fechaNcM"
																		name="fechaNcM" 
																		value="${matriculado.fechaNc}">
																</div>
															</div>
												
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="telefonoM">Telefono </label> <span class="red">*</span><input type="text"
																		class="form-control" id="telefonoM" name="telefonoM"
																		value="${matriculado.telefono}">
																</div>
																<div class="form-group col-md-5">
																	    <div class="control-group">
								                                            <label class="control-label" for="generoM">Genero
								                                                <span class="red">* </span>
								                                            </label>
								                                            <div class="controls">
								                                                <select name="generoM" id="generoM"
								                                                    class="form-control" data-unique="newbilling">
								                                                    <option selected value="${matriculado.genero}">${matriculado.genero}</option>
								                                                    <option value="Hombre">Hombre</option>
								                                                    <option value="Mujer">Mujer</option>								                                                
								                                                </select>
								                                            </div>
								                                        </div>
								                                    </div>
																</div>
													
											
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="calleM">Calle </label> <span class="red">*</span><input type="text"
																		class="form-control" id="calleM" name="calleM"
																		value="${matriculado.calle}">
																</div>
																<div class="form-group col-md-5">
																	<label for="localidadM">Localidad</label> <span class="red">*</span><input
																		type="text" class="form-control" id="localidadM"
																		name="localidadM" 
																		value="${matriculado.localidad}">
																</div>
															</div>
											
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="cpM">Cp </label> <span class="red">*</span><input type="text"
																		class="form-control" id="cpM" name="cpM"
																		value="${matriculado.cp}">
																</div>
																<div class="form-group col-md-5">
																	<label for="provinciaM">Provincia</label> <span class="red">*</span><input
																		type="text" class="form-control" id="provinciaM"
																		name="provinciaM" 
																		value="${matriculado.provincia}">
																</div>
															</div>
													
															<div class="row">
																<div class="form-group col-md-1"></div>
															<div class="form-group col-md-5">
							                                        <div class="control-group">
							                                            <label class="control-label" for="paisM">Pais
							                                                <span class="red">* </span>
							                                            </label>
							                                            <div class="controls">
							                                                <select name="paisM" id="paisM"
							                                                    class="form-control" data-unique="newbilling">
							                                                    <option selected value="${matriculado.pais}">${matriculado.pais}</option>
							                                                    <option value="Spain">Spain</option>
							                                                    <option value="Portugal">Portugal</option>
							                                                    <option value="Francia">Francia</option>
							                                                </select>
							                                            </div>
							                                        </div>
							                                    </div>
																<div class="form-group col-md-5">
																	<label for="dniM">DNI</label> <span class="red">*</span><input
																		type="text" class="form-control" id="dniM"
																		name="dniM" 
																		value="${matriculado.dni}">
																</div>
															</div>
													
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5">
																	    <div class="control-group">
								                                            <label class="control-label" for="cuponM">Cupon
								                                                <span class="red">* </span>
								                                            </label>
								                                            <div class="controls">
								                                                <select name="cuponM" id="cuponM"
								                                                    class="form-control" data-unique="newbilling">
								                                                    <option selected value="${matriculado.cupon}">${matriculado.cupon}</option>
								                                                    <option value="Si">Si</option>
								                                                    <option value="No">No</option>								                                                
								                                                </select>
								                                            </div>
								                                        </div>
								                                    </div>
																<div class="form-group col-md-5">
																	<label for="precioM">Precio</label> <span class="red">*</span><input
																		type="text" class="form-control" id="precioM"
																		name="precioM" readonly
																		value="${matriculado.precio}">
																</div>
															</div>
										
															<div class="row">
																<div class="form-group col-md-1"></div>
																<div class="form-group col-md-5" id="columnas62">
																	<label for="logroM">Logro </label> <span class="red">*</span><input type="text"
																		class="form-control" id="logroM" name="logroM"
																		value="${matriculado.logro}">
																</div>
																<div class="form-group col-md-5">
																	<label for="cursosM">Cursos</label> <span class="red">*</span><input
																		type="text" class="form-control" id="cursosM"
																		name="cursosM" 
																		value="${matriculado.cursos}">
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