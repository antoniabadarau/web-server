package com.github.bbantonia.webserver;

public class TimedConsoleLogger implements Logger {

    private static Long now() {
        return System.currentTimeMillis();
    }

    @Override
    public void info(String message) {
        System.out.println(now() + ": " + message);
    }

    @Override
    public void error(String message) {
        System.err.println(now() + ": " + message);
    }

    @Override
    public void error(Throwable th, String message) {
        System.err.println(String.format("%s: Exception: %s: %s", now(), th.getClass().getSimpleName(), message));
    }
}
