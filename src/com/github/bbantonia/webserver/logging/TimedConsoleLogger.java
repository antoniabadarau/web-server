package com.github.bbantonia.webserver.logging;

import java.io.PrintStream;

public class TimedConsoleLogger extends AbstractLogger implements Logger {

    private final Class<?> forClazz;

    public TimedConsoleLogger(Class<?> forClazz) {
        this.forClazz = forClazz;
    }

    private static Long now() {
        return System.currentTimeMillis();
    }

    @Override
    protected void log(LogLevel level, String message) {
        if (shouldLog(level)) {
            PrintStream stream = level == LogLevel.ERROR ? System.err : System.out;
            stream.println(String.format("[%s] - [%s]: %s", level.name(), forClazz.getCanonicalName(), message));
        }
    }

    @Override
    protected void log(LogLevel level, Throwable th, String message) {
        if (shouldLog(level)) {
            PrintStream stream = level == LogLevel.ERROR ? System.err : System.out;
            stream.println(String.format("[%s] - [%s] - [%s]: %s", now(), level.name(), forClazz.getCanonicalName(), message));
            th.printStackTrace(stream);
        }
    }
}
