package com.github.bbantonia.webserver.logging;

public class LoggerFactory {

    public static Logger getLogger(Class<?> clazz) {
        return new ConsoleLogger(clazz);
    }
}
