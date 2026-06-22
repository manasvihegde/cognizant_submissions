package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAssertEquals() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testAssertNotEquals() {
        assertNotEquals(10, calculator.add(2, 3));
    }

    @Test
    public void testAssertTrue() {
        assertTrue(calculator.isEven(4));
    }

    @Test
    public void testAssertFalse() {
        assertFalse(calculator.isEven(5));
    }

    @Test
    public void testAssertNull() {
        String result = null;
        assertNull(result);
    }

    @Test
    public void testAssertNotNull() {
        assertNotNull(calculator);
    }

    @Test
    public void testAssertThrows() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

    @Test
    public void testAssertAll() {
        assertAll("calculator checks",
            () -> assertEquals(5, calculator.add(2, 3)),
            () -> assertTrue(calculator.isEven(4)),
            () -> assertNotNull(calculator)
        );
    }
}