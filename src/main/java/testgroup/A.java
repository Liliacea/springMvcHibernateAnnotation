package testgroup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class A {
    public static void main(String[] args) {
    String url = "jdbc:postgresql://localhost:5434/postgres";
    String username = "postgres";
    String password = "mypass";
    System.out.println("Connecting...");

    try (Connection connection = DriverManager.getConnection(url, username, password)) {
        System.out.println("Connection successful!");
    } catch (SQLException e) {
        System.out.println("Connection failed!");
        e.printStackTrace();
    }
}
}
