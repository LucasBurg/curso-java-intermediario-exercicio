<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<form name="formLogin" action="DoLogin.jsp" method="post">
	<fieldset>
		<legend>Informações do usuário</legend>
		
		<div>
			<label>Nome</label>
			<input type="text" name="nome">
		</div>
		
		
		<div>
			<label>E-mail</label>
			<input type="email" name="email">
		</div>
		
		<div>
			<label>Senha</label>
			<input type="password" name="senha">
		</div>
		
		<div>
			<input type="submit" value="Enviar!">
		</div>
		
	</fieldset>
</form>
