package io.github.fabiodamas.Cap1_BaseDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex3_ConnectionFactory {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection(
                	"jdbc:mysql://localhost/aula", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}