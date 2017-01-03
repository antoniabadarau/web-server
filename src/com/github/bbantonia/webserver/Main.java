package com.github.bbantonia.webserver;

import com.github.bbantonia.webserver.config.Config;
import com.github.bbantonia.webserver.logging.LoggerFactory;

public class Main {

    public static void main(String[] args) {
        LoggerFactory.getLogger(Main.class).info("test");
        System.out.println(Config.getInstance().getLogLevel());
    }

}
