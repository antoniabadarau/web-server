package com.github.bbantonia.webserver;

import com.github.bbantonia.webserver.config.Config;
import com.github.bbantonia.webserver.logging.Logger;
import com.github.bbantonia.webserver.logging.LoggerFactory;

public class Main {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        logger.info("test");
    }

}
