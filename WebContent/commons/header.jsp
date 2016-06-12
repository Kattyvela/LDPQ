<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>LDPQ</title>

    <!-- Bootstrap Core CSS -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${pageContext.request.contextPath}/css/clean-blog.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='http://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
	
</head>
<body>

    <!-- Set your background image for this header on the line below. -->
    <header class="intro-header" style="background-image: url('${pageContext.request.contextPath}/img/LDPQ.jpg')">
         <nav class="navbar navbar-inverse">
         
  <div class="container-fluid"> 
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#myInverseNavbar2"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
      <a class="navbar-brand" href="${pageContext.request.contextPath}/Vistas/Principal.jsp">Inicio</a> </div>
    <div class="collapse navbar-collapse" id="myInverseNavbar2">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Eventos</a></li>
        <li><a href="#">Videos</a></li>
        <li><a href="${pageContext.request.contextPath}/Vistas/Noticias/Noticias.jsp">Noticias</a></li>
		<li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Clubes<span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="${pageContext.request.contextPath}/Vistas/Deportes/Atletismo.jsp">Atletismo</a></li>
			<li><a href="${pageContext.request.contextPath}/Vistas/Deportes/Futbol.jsp">Fútbol</a></li>
            <li><a href="${pageContext.request.contextPath}/Vistas/Deportes/Rugby.jsp">Rugby</a></li>
			<li><a href="${pageContext.request.contextPath}/Vistas/Deportes/Voleyball.jsp">Voleyball</a></li>
			<li><a href="${pageContext.request.contextPath}/Vistas/Deportes/Basket.jsp">Basketball</a></li>
          </ul>
        </li>
        <li class="dropdown"> <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Mas <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="Noticias.html">Noticias</a></li>
			<li><a href="Contactos.html">Contactos</a></li>
            <li class="divider"></li>
            <li><a href="#">Ayuda!</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                    <div class="site-heading">
                        <h1 style="color:black;">LDPQ</h1>
                        <hr style="color:black;" class="small" >
                        <span style="color:black;" class="subheading">Liga Deportiva Polit&eacute;cnica de Quito</span>
                    </div>
                </div>
            </div>
        </div>
    </header>

