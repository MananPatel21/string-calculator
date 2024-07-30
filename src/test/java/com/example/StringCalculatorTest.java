package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void testAddEmptyString() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }
}
