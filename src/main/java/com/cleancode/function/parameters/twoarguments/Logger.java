package com.cleancode.function.parameters.twoarguments;

public class Logger {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Logger.class.getName());

    public static void log(String message, boolean isError) {
        if (isError) {
            logger.severe(message);
        } else {
            logger.info(message);
        }
    }
}
