<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/miStyle.css" rel="stylesheet" type="text/css">
<title>Login</title>
</head>
<body>
	<!-- Inclusión de una cabecera que muestra/oculta la opción Logout -->
	<jsp:include page="header.jsp"></jsp:include>
	<!-- El siguiente ejemplo de JSTL muestra como usar un if-else mediante la libreria cor: si hay atributo mensaje se muestra en color rojo dicho mensaje, en caso contrario un texto par el formulario  -->
	<div>

		<!-- el siguiente formulario  envia los datos al LoginServlet. Los parametros contienen el atributo name -->

		<div class="centro">
			<img alt="logo"
				src="fonts/Captura de pantalla 2015-10-08 a las 17.44.51.png"
				width="15%" border="5">
		</div>
		<div class="form">
			<div class="header">
				<h2>Administracion</h2>
			</div>
			<div class="login">
				<form action="login" method="post">
					<ul>
						<li><span class="un"><i class="correccion fa fa-user"></i></span><input
							type="text" id="usuario" name="usuario" required class="text"
							placeholder="Correo algo@algo.es"></li>
						<li><span class="un"><i class="correccion fa fa-lock"></i></span><input
							type="password" id="password" name="password" required
							class="text" placeholder="Contraseña"></li>
						<li><input type="submit" value="Iniciar Sesion" class="btn"></li>
					</ul>
				</form>
				<c:choose>
					<c:when test="${not empty mensaje }">
						<p class="error">${mensaje }</p>
					</c:when>
				</c:choose>
			</div>
			<br />
		</div>
	</div>
</body>
</html>