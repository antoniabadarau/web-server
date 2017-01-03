package com.github.bbantonia.webserver.logging;

public enum LogLevel {

    DEBUG, INFO, WARN, ERROR;

    public static LogLevel fromString(String string) {
        for (LogLevel v : values()) {
            if (v.name().toLowerCase().equals(string)) {
                return v;
            }
        }
        throw new IllegalArgumentException(String.format("Unable to find LogLevel value for string '%s'", string));
    }
}
