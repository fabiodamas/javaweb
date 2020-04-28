package io.github.fabiodamas.Cap1_BaseDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex1_EfetuaConexao {
	public static void main(String[] args) {
		try {
			Connection conexao;
			conexao = DriverManager.getConnection("jdbc:mysql://localhost/aula", "root", "");
			conexao.close();
			System.out.println("Conectado!");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}