<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Deportes</title>
</head>
<body>
	<mark> Resultado: <%=request.getAttribute("RESULTADO") %></mark>
	
	<form method = "post" action = "CrearDeporteCtrl">
	Nombre: <input type = "text" name= "txtNombre"/>
	Descripción: <input type = "text" name = "txtDescripcion" />
	
	<input type = "submit" value = "Crear"/>
	</form>
</body>
</html>