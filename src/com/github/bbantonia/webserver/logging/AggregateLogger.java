package com.github.bbantonia.webserver.logging;

import java.util.List;

public class AggregateLogger extends AbstractLogger implements Logger {

    private final List<AbstractLogger> loggers;

    public AggregateLogger(List<AbstractLogger> loggers) {
        this.loggers = loggers;
    }

    @Override
    protected void log(LogLevel level, String message) {
        for (AbstractLogger logger : loggers) {
            logger.log(level, message);
        }
    }

    @Override
    protected void log(LogLevel level, Throwable th, String message) {
        for (AbstractLogger logger : loggers) {
            logger.log(level, th, message);
        }
    }
}
