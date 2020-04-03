package io.github.fabiodamas.Cap1_BaseDados;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class Ex7_Crud {

	public static void main(String[] args) {
		Ex8_Contato contato = new Ex8_Contato();

		contato.setNome("Nome " + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
				.withLocale(new Locale("pt", "br"))).toString());
		contato.setEmail("fabio.damas@gmail.com");
		contato.setEndereco("Avenida Nossa Senhora da Assunção, 780");
		contato.setDataNascimento(Calendar.getInstance());
		Ex6_ContatoDao dao = new Ex6_ContatoDao();
		dao.adiciona(contato);
		System.out.println("Gravado!");

		List<Ex8_Contato> contatos = dao.getLista();
		for (Ex8_Contato c : contatos) {
			System.out.println("Nome: " + c.getNome());
			System.out.println("Email: " + c.getEmail());
			System.out.println("Endereço: " + c.getEndereco());
			System.out.println("Data de Nascimento: " + c.getDataNascimento().getTime() + "\n");
		}

	}

}
