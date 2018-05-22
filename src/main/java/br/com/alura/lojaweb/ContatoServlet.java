package br.com.alura.lojaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.maven.Produto;

@WebServlet(urlPatterns= {"/contato"})
public class ContatoServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter writer = resp.getWriter();
		writer.println("<html><h2>Entre em Contato Conosco!!!</h2></html>");
		writer.println("<html><h2>Agora com o Servidor Wildfly 12.0!!!</h2></html>");
		writer.close();
		
	}

}
