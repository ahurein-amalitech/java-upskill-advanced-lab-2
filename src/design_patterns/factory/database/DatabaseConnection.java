package design_patterns.factory.database;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class DatabaseConnection {
    public abstract Connection connect() throws SQLException;
}
