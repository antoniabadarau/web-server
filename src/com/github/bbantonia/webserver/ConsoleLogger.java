package com.github.bbantonia.webserver;

public class ConsoleLogger implements Logger {
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
