package io.github.fabiodamas.Cap1_BaseDados.Estoque;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sistema")
public class ControllerServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String parametro = request.getParameter("logica");
		String nomeDaClasse = "io.github.fabiodamas.Cap1_BaseDados.Estoque." + parametro;

		try {
			Class<?> classe = Class.forName(nomeDaClasse);
			Logica logica = (Logica) classe.newInstance();

			// Recebe o String ap�s a execu��o da l�gica
			String pagina = logica.executa(request, response);

			// Faz o forward para a p�gina JSP
			request.getRequestDispatcher(pagina).forward(request, response);

		} catch (Exception e) {
			throw new ServletException("A l�gica de neg�cios causou uma exce��o", e);
		}
	}
}