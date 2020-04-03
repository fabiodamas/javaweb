package io.github.fabiodamas.Cap1_BaseDados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class Ex5_JDBCInsere {

        public static void main(String[] args) throws SQLException {

            // conectando
            Connection con = new Ex3_ConnectionFactory().getConnection();

            // cria um preparedStatement
            String sql = "insert into contatos" +
                    " (nome,email,endereco,dataNascimento)" +
                    " values (?,?,?,?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);

            // preenche os valores
            stmt.setString(1, "ludmila");
            stmt.setString(2, "lulu@luluzao.com.br");
            stmt.setString(3, "R. Teste cj57");
            stmt.setDate(4, new java.sql.Date(
                    Calendar.getInstance().getTimeInMillis()));

            // executa
            stmt.execute();
            stmt.close();

            System.out.println("Gravado!");

            con.close();
        }
    }