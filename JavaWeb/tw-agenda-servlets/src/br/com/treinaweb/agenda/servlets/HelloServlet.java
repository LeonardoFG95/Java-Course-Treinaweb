package br.com.treinaweb.agenda.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1153958059465002540L;
	
	// 1 Sobrescrever o método service

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>Olá a partir do servlet</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<p>Olá mundo! vim do servlet.</p> ");
		out.println("	</body>");
		out.println("</html>");
	}
	
	// 2 Configurar o servlet no web.xml e fazer mapeamento

}
