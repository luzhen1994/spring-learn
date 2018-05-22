package com.lz.slf4j;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JSample {
    public static void main(String[] args) {
        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(context);

        Logger logger = LoggerFactory.getLogger(SLF4JSample.class);
        logger.info("Hello, SLF4J!");
    }
}
