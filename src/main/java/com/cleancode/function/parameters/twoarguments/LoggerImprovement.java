package com.cleancode.function.parameters.twoarguments;

public class LoggerImprovement {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoggerImprovement.class.getName());

    public static void log(String message) {
        logger.info(message);
    }

    public static void logError(String message) {
        logger.severe(message);
    }
}
