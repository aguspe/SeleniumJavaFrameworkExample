package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.nio.file.Path;
import java.nio.file.Paths;
public class PropertyHandler {

    private Properties properties;

    public PropertyHandler(String relativePath) {
        properties = new Properties();
        String fullPath = convertToAbsolutePath(relativePath);
        try (FileInputStream in = new FileInputStream(relativePath)) {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    private String convertToAbsolutePath(String relativePath) {
        Path absolutePath = Paths.get(relativePath).toAbsolutePath();
        return absolutePath.toString();
    }
}
