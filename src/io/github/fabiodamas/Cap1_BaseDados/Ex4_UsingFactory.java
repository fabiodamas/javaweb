package io.github.fabiodamas.Cap1_BaseDados;

import java.sql.Connection;
import java.sql.SQLException;

public class Ex4_UsingFactory {
	public static void main(String args[]) throws SQLException {
		 Connection connection = new Ex3_ConnectionFactory().getConnection();
         System.out.println("Conexão aberta!");
         connection.close();
	}

}
