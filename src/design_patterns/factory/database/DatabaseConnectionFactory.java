package design_patterns.factory.database;

class DatabaseConnectionFactory {
    public static DatabaseConnection createConnection(String dbType, String url, String user, String password) {
        return switch (dbType.toLowerCase()) {
            case "mysql" -> new MySQLConnection(url, user, password);
            case "postgresql" -> new PostgreSQLConnection(url, user, password);
            default -> throw new IllegalArgumentException("Unknown database type: " + dbType);
        };
    }
}