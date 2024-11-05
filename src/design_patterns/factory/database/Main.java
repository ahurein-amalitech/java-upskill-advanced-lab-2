package design_patterns.factory.database;

import java.sql.Connection;
import java.sql.SQLException;

class Main {
    public static void main(String[] args) {
        try {
            DatabaseConnection mysqlConn = DatabaseConnectionFactory.createConnection(
                    "mysql",
                    "jdbc:mysql://localhost:1541/mydb",
                    "user",
                    "password"
            );
            Connection connection = mysqlConn.connect();
            System.out.println("Connected to MySQL database!");

            DatabaseConnection postgresConn = DatabaseConnectionFactory.createConnection(
                    "postgresql",
                    "jdbc:postgresql://localhost:4525/mydb",
                    "user",
                    "password"
            );
            connection = postgresConn.connect();
            System.out.println("Connected to PostgreSQL database!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}