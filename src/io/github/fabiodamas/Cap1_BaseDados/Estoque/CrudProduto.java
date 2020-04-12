package io.github.fabiodamas.Cap1_BaseDados.Estoque;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.Locale;

public class CrudProduto {

	public static void main(String[] args) {
		Produto produto = new Produto();
		ProdutoDao dao = new ProdutoDao();

		produto.setNome("produto " + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
				.withLocale(new Locale("pt", "br"))).toString());
		
		dao.adiciona(produto);
		System.out.println("Gravado!");

		produto = new Produto();
		produto.setId(0);
		produto.setNome("alterado");
		dao.altera(produto);
		
		List<Produto> produtos = dao.getLista();
		for (Produto c : produtos) {
			System.out.println("Código: " + c.getId());
			System.out.println("Nome: " + c.getNome());
		}

		
		produto = new Produto();
		produto.setId(0);
		produto.setNome("alterado");
		dao.altera(produto);
		
		
		
		dao.fechar();
		
		

	}

}
