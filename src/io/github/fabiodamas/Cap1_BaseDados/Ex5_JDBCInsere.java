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
            
            Contato c = new Contato();
            
            c.setNome("fabio");
            c.setEmail("fabio@teste.com.br");
            c.setEndereco("Rua Aurora, 123");
            c.setDataNascimento(Calendar.getInstance());

            // preenche os valores
            stmt.setString(1,c.getNome());
            stmt.setString(2, c.getEmail());
            stmt.setString(3, c.getEndereco());
            stmt.setDate(4, new java.sql.Date( c.getDataNascimento().getTimeInMillis()));

            // executa
            stmt.execute();
            stmt.close();

            System.out.println("Gravado!");

            con.close();
        }
    }