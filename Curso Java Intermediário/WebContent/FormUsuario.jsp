<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Usuário</title>
</head>
<body>
	<h1>Formulário do usuário</h1>
	<form action="SvtUsuario" method="post">
		<fieldset>
			<label>Usuário</label>
			<input type="text" name="usuario">
			<label>Senha</label>
			<input type="password" name="senha">
			<input type="submit" value="Enviar">
		</fieldset>
	</form>
	
	
</body>
</html>