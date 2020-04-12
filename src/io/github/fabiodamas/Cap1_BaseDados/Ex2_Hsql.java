package io.github.fabiodamas.Cap1_BaseDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex2_Hsql {

	public static void main(String[] args) {
		// "jdbc:hsqldb:mem:estoque"
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:hsqldb:file:./database/estoque;shutdown=true", "sa", "");

			// banco de dados

   		    String sql = "create table IF NOT EXISTS produto (id INTEGER IDENTITY PRIMARY KEY, nome varchar(30)); ";
   		 
			java.sql.PreparedStatement stmt = con.prepareStatement(sql);
			
			/* stmt.execute();
			stmt.close();
			

			sql = "insert into produto (nome) values ( 'teclado') ;";
			stmt = con.prepareStatement(sql);
			stmt.execute();
			stmt.close();

			sql = " insert into produto (nome) values ('monitor') ;";
			stmt = con.prepareStatement(sql);
			stmt.execute();
			stmt.close();
			*/
			stmt = con.prepareStatement("select * from produto");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("nome"));
				System.out.println("");
			}

			rs.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
