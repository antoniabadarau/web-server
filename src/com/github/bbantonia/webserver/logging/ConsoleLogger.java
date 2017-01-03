package com.github.bbantonia.webserver.logging;

public class ConsoleLogger extends AbstractLogger implements Logger {

    private final Class<?> forClazz;

    public ConsoleLogger(Class<?> forClazz) {
        this.forClazz = forClazz;
    }

    @Override
    public void info(String message) {
        if (shouldLog(LogLevel.INFO)) {
            System.out.println(message);
        }
    }

    @Override
    public void error(String message) {
        if (shouldLog(LogLevel.ERROR)) {
            System.err.println(message);
        }
    }

    @Override
    public void error(Throwable th, String message) {
        if (shouldLog(LogLevel.ERROR)) {
            System.err.println(String.format("Exception: %s: %s", th.getClass().getSimpleName(), message));
        }
    }
}
