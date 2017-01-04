package com.github.bbantonia.webserver.logging;

public interface Logger {

    void debug(String message);
    void info(String message);
    void warn(String message);
    void error(String message);
    void error(Throwable th, String message);
}
