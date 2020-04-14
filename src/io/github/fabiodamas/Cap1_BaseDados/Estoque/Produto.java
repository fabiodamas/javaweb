package io.github.fabiodamas.Cap1_BaseDados.Estoque;

import java.util.Date;

public class Produto {
	private int id;
	private String nome;
	private Date dataCriacao;
	private String emailFabricante;

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

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getEmailFabricante() {
		return emailFabricante;
	}

	public void setEmailFabricante(String emailFabricante) {
		this.emailFabricante = emailFabricante;
	}	
}