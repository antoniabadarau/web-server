package com.github.bbantonia.webserver.logging;

public interface Logger {

    void info(String message);
    void error(String message);
    void error(Throwable th, String message);
}
