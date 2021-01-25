<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alteração de contato ${contato.nome}</title>
</head>
<body>
	<h2>Inclusão de contato ${contato.nome}</h2>
	<form method="post" action="${pageContext.request.contextPath}/agenda/editar">
		<input type="hidden" name="id" value="${contato.id}" >
		<p>Nome:</p>
		<p><input type="text" name="nome" value="${contato.nome}"></p>
		<p>Idade:</p>
		<p><input type="number" name="idade" value="${contato.idade}"></p>
		<p>Telefone:</p>
		<p><input type="text" name="telefone" value="${contato.telefone}"></p>
		<button type="submit">Salvar!</button>		
	</form>
</body>
</html>