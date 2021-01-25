<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Contatos</title>
</head>
<body>
	<h3>Lista de Contatos</h3>
	<p style="color: red;">${mensagemErro}</p>
	<table border="1">
		<thead>
			<tr>
				<th>Nome</th>
				<th>Idade</th>
				<th>Telefone</th>
				<th>A��es</th>
			</tr>
		</thead>
		<tbody>
			<jstl:forEach items="${listaContatos}" var="contato">
				<tr>
					<td>${contato.nome}</td>
					<td>${contato.idade}</td>
					<td>${contato.telefone}</td>
					<td>
						<a href="${pageContext.request.contextPath}/agenda/editar?id=${contato.id}">Editar</a> |
						<a href="${pageContext.request.contextPath}/agenda/excluir?id=${contato.id}">Excluir</a>
					</td>
				</tr>
			</jstl:forEach>
		</tbody>
	</table>
	<a href="${pageContext.request.contextPath}/agenda/incluir">Criar novo contato...</a>
</body>
</html>