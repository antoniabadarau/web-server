package com.github.bbantonia.webserver.config;

import com.github.bbantonia.webserver.logging.LogLevel;

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

    public LogLevel getLogLevel() {
        return LogLevel.fromString(properties.getProperty("log.level"));
    }

    public Integer getListenPort() {
        return Integer.parseInt(properties.getProperty("listen.port"));
    }

    public String getLoggerType() {
        return properties.getProperty("logger.type");
    }
}
