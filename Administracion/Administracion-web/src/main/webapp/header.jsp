<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>iLexion</title>

<!-- Bootstrap Core CSS formato-->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Custom CSS barra vetical-->
<link href="css/sb-admin.css" rel="stylesheet">
<!-- Custom Fonts icono-->
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">



<!-- jQuery desplejable-->
<script src="js/jquery.js"></script>
<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>
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
					<li><a href="registrado.jsp"> Registrados</a></li>
					<li><a href="matriculado.jsp"> Matriculados</a></li>
					<li><a href="cursos.jsp"> Cursos</a></li>
					<li><a href="javascript:;" data-toggle="collapse"
						data-target="#demo"> Validacion <i
							class="fa fa-fw fa-caret-down"></i></a>
						<ul id="demo" class="collapse">
							<li><a href="validarCurso.jsp">Validar Curso</a></li>
							<li><a href="eliminarCurso.jsp">Eliminar Curso</a></li>
						</ul></li>
					<!-- aqui van las redireciones entre li a -->
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</nav>
		
	</div>

	<!-- /#wrapper -->
	
</body>
</html>