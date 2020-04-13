package io.github.fabiodamas.Cap1_BaseDados.Estoque;

import java.util.Date;

public class Produto {

	private int id;
	private String nome;
	private Date dataCriacao;
	private String email_fabricante;

	public int getId() {
		return this.id;
	}

	public void setId(int i) {
		this.id = i;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String novo) {
		this.nome = novo;
	}

}