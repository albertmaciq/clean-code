package com.cleancode.function.parameters.twoarguments;

public class LoggerMain {

    public static void main(String[] args) {
        Logger.log("Hi there!", false);
        LoggerImprovement.log("Hi there!");
        LoggerImprovement.logError("An error!");
    }
}
