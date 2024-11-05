package design_patterns.singleton.logger;

public class Logger {
    private static Logger instance;

    private Logger() {}

    public void log(String message) {
        System.out.println("[LOG] " + java.time.LocalDateTime.now() + ": " + message);
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}
