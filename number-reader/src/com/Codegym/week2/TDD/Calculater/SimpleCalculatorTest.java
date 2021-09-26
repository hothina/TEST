package com.Codegym.week2.TDD.Calculater;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {
    @Test
    @DisplayName("Testing add 0 + 0")
    public void testAdd0And0(){
        int fist = 0;
        int second = 0;
        int expected = 0;
        int result = SimpleCalculator.add(fist, second);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Testing add 2 + 5")
    public void testAdd2And5(){
        int fist = 2;
        int second = 5;
        int expected = 7;
        int result = SimpleCalculator.add(fist, second);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing sub 0 - 0")
    public void testSub0and0() {
        int first = 0;
        int second = 0;
        int expected = 0;

        int result = SimpleCalculator.sub(first, second);
        assertEquals(expected, result);
    }

}
