<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<!-- Bootstrap Core CSS formato-->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS barra vetical-->
<link href="css/sb-admin.css" rel="stylesheet">

<!-- Custom Fonts icono-->
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Administracion</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-ex1-collapse">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.jsp">iLexion</a>
		</div>
		<!-- Top Menu Items -->
		<ul class="nav navbar-right top-nav">
			<li class="dropdown"><a href="#" class="dropdown-toggle"
				data-toggle="dropdown"><i class="fa fa-user"></i> Admin <b
					class="caret"></b></a>
				<ul class="dropdown-menu">
					<li><a href="login?accion=salir"><i
							class="fa fa-fw fa-power-off"></i> Cerrar sesion</a></li>
				</ul></li>
		</ul>
		<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
<div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav navbar-nav side-nav">
					<li><a href="index.jsp"> Inicio</a></li>
					<li><a href="registrado.jsp"> Registrados</a></li>
					<li><a href="matriculado.jsp"> Matriculados</a></li>
					<li><a href="cursos.jsp"> Cursos</a></li>
					<li>
                        <a href="javascript:;" data-toggle="collapse" data-target="#demo"> Validacion <i class="fa fa-fw fa-caret-down"></i></a>
                        <ul id="demo" class="collapse">
                            <li>
                                <a href="validarCurso.jsp">Validar Curso</a>
                            </li>
                            <li>
                                <a href="eliminarCurso.jsp">Eliminar Curso</a>
                            </li>
                        </ul>
                    </li>
					<!-- aqui van las redireciones entre li a -->
				</ul>
			</div>
		<!-- /.navbar-collapse --> </nav>

		<div id="page-wrapper">

			<div id="Contenido">

				<h1>Bienvenido a la pagina de administracion de iLexion</h1>
				<p>En este apartado puedes modificar los formularios de los
					datos Reguistrado, Matriculado y Cursos</p>
				<!-- /.container-fluid -->
				<div>
					<!-- Inclusión de una cabecera que muestra/oculta la opción Logout -->
					<jsp:include page="header.jsp"></jsp:include>
					<h1>Hola</h1>
					<h2>Tu nombre es: ${param.usuario}</h2>
					<!--sessionScope.usuario.nombre Esto saca el objeto usuario almacenado en la sesion por el LoginServlet y accede a su propiedad nombre -->
					<h2>tu clave es: ${param.password }</h2>
					<!-- Esto saca el parametro pasado por el usuario y recogido dentro del objeto request -->
					<c:if test="${empty param.password }">
						<p class="error">Si ves el nombre de usuario pero no la
							password es porque el nombre esta almacenado en session, mientras
							que la password en request.</p>
					</c:if>
					<h3>Aqui tienes el listado de usuarios</h3>
					<c:if test="${empty usuarios }">
						<!-- usuarios es un atributo metido en el request por eso no es necesario ponerle el prefijo param -->
						<p class="error">Si no ves usuarios es porque has accedido
							directamente a la pagina y por tanto no has pasado por el servlet
							controlador y no hay datos en el objeto request.</p>
					</c:if>
					<table border="1">
						<tr>
							<th>Nombre</th>
							<th>Apellidos</th>
						</tr>
						<c:forEach items="${usuarios }" var="usuario">
							<!-- recorremos todos los objetos de la coleccion usuarios y cada objeto devuelto lo asignamos a la variable usuario -->
							<tr>
								<td>${usuario.nombre }</td>
								<!-- Usuario es un POJO por lo que podemos acceder a sus propiedades sin necesidad de get/set -->
								<td>${usuario.apellidos }</td>
							</tr>

						</c:forEach>
					</table>
					<p>
						<a href="login.jsp">Volver</a>
					</p>
				</div>
			</div>

		</div>
		<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->
</body>
<!-- jQuery desplejable-->
<script src="js/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>
</html>