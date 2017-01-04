package com.github.bbantonia.webserver.logging;

import com.github.bbantonia.webserver.config.Config;

import java.util.Arrays;

public final class LoggerFactory {

    public static Logger getLogger(Class<?> clazz) {
        String loggerType = Config.getInstance().getLoggerType();
        switch (loggerType) {
            case "console":
                return new ConsoleLogger(clazz);
            case "timed":
                return new TimedConsoleLogger(clazz);
            case "aggregate":
                return new AggregateLogger(Arrays.asList(new ConsoleLogger(clazz), new TimedConsoleLogger(clazz)));
            default:
                return new ConsoleLogger(clazz);
        }
    }
}
