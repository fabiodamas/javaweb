package io.github.fabiodamas.Cap1_BaseDados;

import java.sql.Connection;
import java.sql.DriverManager;

public class Ex1_EfetuaConexao2 {

	public static void main(String[] args) {

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost", "root", "");
			System.out.println("conectado" );
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
