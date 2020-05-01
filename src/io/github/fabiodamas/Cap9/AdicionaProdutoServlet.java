package io.github.fabiodamas.Cap9;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.github.fabiodamas.Cap1_BaseDados.Estoque.Produto;
import io.github.fabiodamas.Cap1_BaseDados.Estoque.ProdutoDao;

@WebServlet("/adicionaProduto")
public class AdicionaProdutoServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		ProdutoDao dao = new ProdutoDao();

		
		PrintWriter out = response.getWriter();

		String nome = request.getParameter("nome");
		String emailFabricante = request.getParameter("email_fabricante");
		Calendar dataCriacao = Calendar.getInstance();

		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setEmailFabricante(emailFabricante);
		produto.setDataCriacao(dataCriacao.getTime());

		// salva o produto
		dao.adiciona(produto);
		
		dao.fechar();
		
		 RequestDispatcher rd = request
			        .getRequestDispatcher("/produto-adicionado.jsp");
		 rd.forward(request,response);	
		 
		 
	}
}