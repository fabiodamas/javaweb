package io.github.fabiodamas.Cap1_BaseDados.Estoque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactoryEstoque {
    public Connection getConnection() {
        try {
        	
        	DriverManager.registerDriver(new org.hsqldb.jdbcDriver());        	
            return DriverManager.getConnection("jdbc:hsqldb:file:./database/estoque;shutdown=true", "sa", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}