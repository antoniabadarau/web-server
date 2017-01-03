package com.github.bbantonia.webserver;

public class LoggerFactory {

    public static Logger getLogger(Class<?> clazz) {
        return new ConsoleLogger(clazz);
    }
}
