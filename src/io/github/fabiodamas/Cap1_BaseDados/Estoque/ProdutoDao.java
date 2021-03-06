package io.github.fabiodamas.Cap1_BaseDados.Estoque;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao {

	private Connection connection;

	public ProdutoDao() {
		this.connection = new ConnectionFactoryEstoque().getConnection();
	}

	public void criar() {
		// "jdbc:hsqldb:mem:estoque"
		try {
			// banco de dados
			java.sql.PreparedStatement stmt ;
			String sql ;

			/*
			String sql = "drop table produto";
			stmt = connection.prepareStatement(sql);
			
			stmt.execute();
			stmt.close();
			*/
			
			sql = "create table IF NOT EXISTS produto (id INTEGER IDENTITY PRIMARY KEY, nome varchar(30), emailFabricante varchar(30), dataCriacao date) ; ";
			stmt = connection.prepareStatement(sql);
			stmt.execute();
			stmt.close();
			

			sql = "insert into produto (nome, emailFabricante, dataCriacao) values ( 'm�scara','contato@sol.com.br', '2020-04-13') ;";
			stmt = connection.prepareStatement(sql);
			stmt.execute();
			stmt.close();

			sql = "insert into produto (nome, emailFabricante, dataCriacao) values ( 'camisa','contato@riachuelo.com.br', '2020-04-13') ;";
			stmt = connection.prepareStatement(sql);
			stmt.execute();
			stmt.close();

			stmt = connection.prepareStatement("select * from produto");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("nome"));
				System.out.println(rs.getString("emailFabricante"));
				System.out.println(rs.getString("dataCriacao"));
				System.out.println("");
			}

			rs.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void adiciona(Produto produto) {
		String sql = "insert into produto (nome, emailFabricante, dataCriacao) values ( ?,?, ?) ;";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getEmailFabricante());
			stmt.setDate(3, new java.sql.Date( produto.getDataCriacao().getTime()));
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Produto> getLista() {
		try {
			List<Produto> produtos = new ArrayList<Produto>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from produto");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// criando o objeto produto
				Produto produto = new Produto();
				produto.setId(rs.getInt("id"));
				produto.setNome(rs.getString("nome"));
				produto.setDataCriacao(rs.getDate("dataCriacao"));
				produto.setEmailFabricante(rs.getString("emailFabricante"));
				produtos.add(produto);
			}
			rs.close();
			stmt.close();
			return produtos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void altera(Produto produto) {
		String sql = "update produto set nome=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, produto.getNome());
			stmt.setInt(2, produto.getId());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void remove(Produto produto) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete " + "from produto where id=?");
			stmt.setInt(1, produto.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void fechar() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}