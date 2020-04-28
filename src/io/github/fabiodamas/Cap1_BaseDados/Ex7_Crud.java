package io.github.fabiodamas.Cap1_BaseDados;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class Ex7_Crud {

	public static void main(String[] args) {
		Contato contato = new Contato();

		// adiciona
		contato.setNome("Nome " + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
				.withLocale(new Locale("pt", "br"))).toString());
		contato.setEmail("fabio.damas@gmail.com");
		contato.setEndereco("Avenida Nossa Senhora da Assunção, 780");
		contato.setDataNascimento(Calendar.getInstance());
		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
		System.out.println("Gravado!");

		// getLista
		List<Contato> contatos = dao.getLista();
		for (Contato c : contatos) {
			
			System.out.println("Id: " + c.getId());
			System.out.println("Nome: " + c.getNome());
			System.out.println("Email: " + c.getEmail());
			System.out.println("Endere�o: " + c.getEndereco());
			System.out.println("Data de Nascimento: " + c.getDataNascimento().getTime() + "\n");
		}
		
		
		// getById
		Contato busca = new Contato();
		busca = dao.getById(5);
		System.out.println(busca);
		
		// update
		busca.setNome("Alterado");
		dao.altera(busca);
		
		
		// dao.remove(busca);
		
		
	}

}
