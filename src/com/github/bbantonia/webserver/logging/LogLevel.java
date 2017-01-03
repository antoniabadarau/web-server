package com.github.bbantonia.webserver.logging;

import java.util.Comparator;

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

    public static final class LogLevelComparator implements Comparator<LogLevel> {
        @Override
        public int compare(LogLevel left, LogLevel right) {
            return left.ordinal() - right.ordinal();
        }
    }
}
