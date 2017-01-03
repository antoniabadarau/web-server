package com.github.bbantonia.webserver.config;

import java.io.*;
import java.util.Properties;

public class Config {

    private static Config config;

    public static Config getInstance() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }

    private Properties properties = new Properties();

    private Config() {
        File file = new File("config.properties");
        try {
            properties.load(new BufferedReader(new InputStreamReader(new FileInputStream(file))));
        } catch (IOException e) {
            String message = String.format("Unable to load application configuration from: '%s'", file.getAbsolutePath());
            throw new RuntimeException(message, e);
        }
    }

    public String getLogLevel() {
        return properties.getProperty("log.level");
    }
}
