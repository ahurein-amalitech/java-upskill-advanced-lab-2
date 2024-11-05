package design_patterns.factory.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class PostgreSQLConnection extends DatabaseConnection {
    private final String url;
    private final String user;
    private final String password;

    public PostgreSQLConnection(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    @Override
    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
