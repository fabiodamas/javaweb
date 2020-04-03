package io.github.fabiodamas.Cap1_BaseDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex2_Hsql {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:hsqldb:mem:estoque", "sa", "");

		// banco de dados
		String sql = "create table produtos (id int, nome varchar(30)); ";
		java.sql.PreparedStatement stmt = con.prepareStatement(sql);
		stmt.execute();
		stmt.close();

		sql = "insert into produtos (id, nome) values (1, 'vassoura') ;";
		stmt = con.prepareStatement(sql);
		stmt.execute();
		stmt.close();
		
		
		sql =  " insert into produtos (id, nome) values (2, 'mouse') ;";
		stmt = con.prepareStatement(sql);
		stmt.execute();
		stmt.close();

		
		stmt = con.prepareStatement("select * from produtos");
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt("id"));
			System.out.println(rs.getString("nome"));
			System.out.println("");
		}
		
		rs.close();
		con.close();

	}

}
