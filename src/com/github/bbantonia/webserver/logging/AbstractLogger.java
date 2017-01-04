package com.github.bbantonia.webserver.logging;

import com.github.bbantonia.webserver.config.Config;

public abstract class AbstractLogger implements Logger {

    protected AbstractLogger() {}

    protected final boolean shouldLog(LogLevel intent) {
        LogLevel.LogLevelComparator comparator = new LogLevel.LogLevelComparator();
        return comparator.compare(intent, Config.getInstance().getLogLevel()) >= 0;
    }

    protected abstract void log(LogLevel level, String message);

    protected abstract void log(LogLevel level, Throwable th, String message);

    @Override
    public void debug(String message) {
        log(LogLevel.DEBUG, message);
    }

    @Override
    public void info(String message) {
        log(LogLevel.INFO, message);
    }

    @Override
    public void warn(String message) {
        log(LogLevel.WARN, message);
    }

    @Override
    public void error(String message) {
        log(LogLevel.ERROR, message);
    }

    @Override
    public void error(Throwable th, String message) {
        log(LogLevel.ERROR, th, message);
    }
}
