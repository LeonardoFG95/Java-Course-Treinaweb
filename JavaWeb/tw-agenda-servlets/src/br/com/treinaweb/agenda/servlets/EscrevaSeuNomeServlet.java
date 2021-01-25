package br.com.treinaweb.agenda.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class EscrevaSeuNomeServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6121551722317697209L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>Nome de Usuário</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<form action=\"/tw-agenda-servlets/receberMensagem\">");
		out.println("			<p>Digite seu nome:</p>");
		out.println("			<p><input type=\"text\" name=\"nomeUsuario\"></p>");
		out.println("			<p><button type=\"submit\">Enviar!</button></p>");
		out.println("		</form>");
		out.println("	<body>");
		out.println("</html>");
	}

	
	
}
