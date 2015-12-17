<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
<c:set var="bf" scope="session" value="${beneficioAdmin}"></c:set>
	<div id="wrapper">
		<div id="page-wrapper">
			<div class="container-fluid">
			<div class="row">
					<div class="col-lg-12 ">
						<h1 class="page-header">Tabla de beneficio</h1>
						<div class="table-responsive panel panel-default">
							<table class="table table-hover">
								<thead>
									<tr>
										<th>Curso</th>
										<th>Profesor</th>
									<th>Beneficio</th>
							

									</tr>
								</thead>
									<tbody>
								<c:forEach items="${beneficioProfe }" var="registrado">
									<tr>
										<td>${registrado.titulo}</td>
										<td>${registrado.usuario}</td>
									<td>${registrado.descuentoCupon}</td>
										<td class="text-center">
											
										</td>
									</tr>
									
								</c:forEach>
									</tbody>
							</table>
						</div>
					</div>
				</div>


			<label for="bf">Beneficio del Administracion </label> <input
				type="text" class="form-control" id="bf"
				name="bf" 
				value="${bf}">
				<br></br>
			</div>
					</div>
				</div>
				
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>