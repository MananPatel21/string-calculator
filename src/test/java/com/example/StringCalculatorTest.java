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

    // Testing for 2 numbers
    @Test
    public void testAddTwoNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(63, calculator.add("18,45"));
    }

    // Testing for multiple numbers (Contains ,)
    @Test
    public void testAddMultipleNumbers() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(96, calculator.add("18,45,33"));
    }

    // Testing for multiple numbers (Contains \n & ,)
    @Test
    public void testAddWithNewLines() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(96, calculator.add("18\n45,33"));
    }

    // Testing for multiple numbers (Using new delimiters)
    @Test
    public void testAddWithCustomDelimiter() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(63, calculator.add("//;\n18;45"));
    }

    // Testing for multiple numbers (-ve numbers are present)
    @Test(expected = IllegalArgumentException.class)
    public void testAddWithNegativeNumbers() {
        StringCalculator calculator = new StringCalculator();
        calculator.add("//;\n18;45;-99;-100");
    }

    // Testing for multiple numbers (non-numeric are present)
    @Test(expected = IllegalArgumentException.class)
    public void testAddWithNonNumeric() {
        StringCalculator calculator = new StringCalculator();
        calculator.add("//;\n18,45");
    }

}
