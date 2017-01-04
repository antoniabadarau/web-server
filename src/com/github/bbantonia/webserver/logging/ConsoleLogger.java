package com.github.bbantonia.webserver.logging;

import java.io.PrintStream;

public class ConsoleLogger extends AbstractLogger implements Logger {

    private final Class<?> forClazz;

    public ConsoleLogger(Class<?> forClazz) {
        this.forClazz = forClazz;
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
            stream.println(String.format("[%s] - [%s]: %s", level.name(), forClazz.getCanonicalName(), message));
            th.printStackTrace(stream);
        }
    }
}
