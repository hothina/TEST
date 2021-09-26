package com.Codegym.week2.TDD.NextDay;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    @DisplayName("3-7-2020")
    public void nextDay372020() {
        int day = 3;
        int mont = 7;
        int year = 2020;
        String expected = "4-7-2020";
        String result = NextDayCalculator.nextDay(day,mont,year);
        assertEquals(expected,result);

    }

}