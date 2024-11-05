package design_patterns.singleton.configuration_manager;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager manager = ConfigurationManager.getInstance();
        String environment = manager.getConfigValue("environment");
        System.out.println("Environment : " + environment);
    }
}
