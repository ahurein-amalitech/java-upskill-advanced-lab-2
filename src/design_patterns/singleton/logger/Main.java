package design_patterns.singleton.logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Error happened");
    }
}
