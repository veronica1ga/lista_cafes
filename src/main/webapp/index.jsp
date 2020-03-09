<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<form name="loginForm" method="post"
		action="/GalaxiaGonzalezV/miscafesGonzalez">
		<h1>Café</h1>
		Extras: <input type="checkbox" name="cafe" value="normal" />Leche
		Normal <input type="checkbox" name="cafe" value="desnatada" />Desnatada
		<input type="checkbox" name="cafe" value="soja" />Con Soja <input
			type="checkbox" name="cafe" value="azucar" />Con Azúcar <input
			type="checkbox" name="cafe" value="limon" />Con Limón <input
			type="checkbox" name="cafe" value="canela" />Con Canela <input
			type="checkbox" name="cafe" value="licor" />Con licor <input
			type="checkbox" name="cafe" value="condensada" />Con lecha
		condensada 
		<br /> <br /> 
		Tipo de café<select name="tipo">
			<option value="cafe">Café</option>
			<option value="nada">Nada</option>
			<option value="infusion">Infusión</option>

		</select> <br /> <input type="submit" value="Login" />
	</form>


</body>
</html>
