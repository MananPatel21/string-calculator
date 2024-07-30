package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    // Testing empty string
    @Test
    public void testAddEmptyString() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

    // Testing for single number
    @Test
    public void testAddSingleNumber() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(21, calculator.add("21"));
    }

}
