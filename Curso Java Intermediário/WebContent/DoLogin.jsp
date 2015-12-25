<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Informações do usuário</title>
</head>
<body>
	<h1>Informações do formulário usuário.</h1>

	<% 
	String nome  = request.getParameter("nome");
	String email = request.getParameter("email");
	String senha = request.getParameter("senha");
	
	out.println("<p>Nome: " + nome + "</p>");
	out.println("<p>E-mail: " + email + "</p>");
	out.println("<p>Senha: " + senha + "</p>");
	
	
	
	%>
</body>
</html>