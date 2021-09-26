package com.Codegym.week2.TDD.Absolute;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteCalculatorTest {
    @Test
    void tesFindAbsolute0() {
        int number = 0;
        int expectec = 0;
        int result = AbsoluteCalculator.findAbsolutor(number);
        assertEquals(expectec,result);
    }

    @Test
    void tesFindAbsolute1() {
        int number = -1;
        int expectec = 1;
        int result = AbsoluteCalculator.findAbsolutor(number);
        assertEquals(expectec,result);
    }

}