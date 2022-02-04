package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    void getLastLogTest() {
        //Given
        logger = Logger.INSTANCE;
        logger.log("Error #12");

        //When
        String lastLog = logger.getLastLog();

        //Then
        assertEquals(lastLog, "Error #12");
    }
}
