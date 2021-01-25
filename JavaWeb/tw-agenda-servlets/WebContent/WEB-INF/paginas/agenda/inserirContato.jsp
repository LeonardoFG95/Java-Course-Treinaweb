<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inclusão de Contato</title>
</head>
<body>
	<h2>Inclusão de Contato</h2>
	<form method="post" action="${pageContext.request.contextPath}/agenda/incluir">
		<p>Nome:</p>
		<p><input type="text" name="nome"></p>
		<p>Idade:</p>
		<p><input type="number" name="idade"></p>
		<p>Telefone:</p>
		<p><input type="text" name="telefone"></p>
		<button type="submit">Salvar!</button>		
	</form>
</body>
</html>