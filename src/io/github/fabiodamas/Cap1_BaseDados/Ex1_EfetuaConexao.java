package io.github.fabiodamas.Cap1_BaseDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex1_EfetuaConexao {
    public static void main(String[] args) throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/aula", "root", "");
        System.out.println("Conectado!");
        conexao.close();
        
    }
}