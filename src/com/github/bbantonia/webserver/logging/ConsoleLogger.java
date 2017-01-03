package com.github.bbantonia.webserver.logging;

public class ConsoleLogger implements Logger {

    private final Class<?> forClazz;

    public ConsoleLogger(Class<?> forClazz) {
        this.forClazz = forClazz;
    }

    @Override
    public void info(String message) {
        System.out.println(message);
    }

    @Override
    public void error(String message) {
        System.err.println(message);
    }

    @Override
    public void error(Throwable th, String message) {
        System.err.println(String.format("Exception: %s: %s", th.getClass().getSimpleName(), message));
    }
}
