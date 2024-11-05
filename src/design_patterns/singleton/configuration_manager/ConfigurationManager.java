package design_patterns.singleton.configuration_manager;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Properties properties;

    private ConfigurationManager() {
        properties = new Properties();
        loadConfiguration();
    }

    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    private void loadConfiguration() {
        File file = new File("application.properties");
        String filePath = "src/design_patterns/singleton/configuration_manager/" + file.getPath();

        try (FileInputStream fs = new FileInputStream(filePath)) {
            properties.load(fs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getConfigValue(String key) {
        return properties.getProperty(key);
    }
}
