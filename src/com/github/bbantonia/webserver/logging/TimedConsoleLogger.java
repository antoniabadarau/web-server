package com.github.bbantonia.webserver.logging;

public class TimedConsoleLogger extends AbstractLogger implements Logger {

    private final Class<?> forClazz;

    public TimedConsoleLogger(Class<?> forClazz) {
        this.forClazz = forClazz;
    }

    private static Long now() {
        return System.currentTimeMillis();
    }

    @Override
    public void info(String message) {
        if (shouldLog(LogLevel.INFO)) {
            System.out.println(now() + ": " + message);
        }
    }

    @Override
    public void error(String message) {
        if (shouldLog(LogLevel.ERROR)) {
            System.err.println(now() + ": " + message);
        }
    }

    @Override
    public void error(Throwable th, String message) {
        if (shouldLog(LogLevel.ERROR)) {
            System.err.println(String.format("%s: Exception: %s: %s", now(), th.getClass().getSimpleName(), message));
        }
    }
}
