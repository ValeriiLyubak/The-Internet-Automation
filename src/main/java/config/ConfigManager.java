package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {

    private static Properties prop;

    static {
        try (InputStream input = new FileInputStream("config.properties")) {
            prop = new Properties();
            prop.load(input);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static String getBaseUrl()
    { return prop.getProperty("baseUrl"); }
}
