package com.github.bbantonia.webserver;

import com.github.bbantonia.webserver.config.Config;

public class Main {

    public static void main(String[] args) {
        LoggerFactory.getLogger(Main.class);
        System.out.println(Config.getInstance().getLogLevel());
    }

}
