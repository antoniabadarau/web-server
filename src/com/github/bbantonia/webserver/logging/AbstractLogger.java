package com.github.bbantonia.webserver.logging;

import com.github.bbantonia.webserver.config.Config;

public abstract class AbstractLogger implements Logger {

    protected AbstractLogger() {}

    protected final boolean shouldLog(LogLevel intent) {
        LogLevel.LogLevelComparator comparator = new LogLevel.LogLevelComparator();
        return comparator.compare(intent, Config.getInstance().getLogLevel()) >= 0;
    }
}
