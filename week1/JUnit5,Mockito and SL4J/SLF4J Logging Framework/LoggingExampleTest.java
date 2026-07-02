package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoggingExampleTest {

    private LoggingExample loggingExample;

    @BeforeEach
    void setUp() {
        loggingExample = new LoggingExample();
    }

    @Test
    void testMainRunsWithoutException() {
       
        assertDoesNotThrow(() -> LoggingExample.main(new String[]{}));
    }
}