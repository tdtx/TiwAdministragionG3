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
                                         <button class="btn btn-info btn-xs" data-toggle="modal" data-toggle="tooltip" data-placement="left" title="Editar Proveedor" >
                                                <span class="glyphicon glyphicon-pencil"></span>
                                        </button>
                                        <a class="btn btn-danger btn-xs" data-toggle="modal tooltip" data-placement="left" title="Eliminar Proveedor" href="#"> <span class="glyphicon glyphicon-trash"></span></a></td>
                                    </tr>
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