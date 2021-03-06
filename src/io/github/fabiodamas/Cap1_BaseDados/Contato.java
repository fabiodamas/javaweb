package io.github.fabiodamas.Cap1_BaseDados;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Contato {

	private Long id;
	private String nome;
	private String email;
	private String endereco;
	private Calendar dataNascimento;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String novo) {
		this.nome = novo;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String novo) {
		this.email = novo;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String novo) {
		this.endereco = novo;
	}

	@Override
	public String toString() {
		return "Contato [id=" + id + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco
				+ ", dataNascimento=" + dataNascimento + "]";
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long novo) {
		this.id = novo;
	}

	public Date ConvertidoDataNascimento() {
		Calendar cal = dataNascimento;
		cal.add(Calendar.DATE, 1);
		Date date = cal.getTime();
		return date;
	}

	public Calendar getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}