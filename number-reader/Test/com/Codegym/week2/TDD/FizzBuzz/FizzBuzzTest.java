package com.Codegym.week2.TDD.FizzBuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    @DisplayName("Test : 3")
    public void testFizzBuzz3() {
        int num = 3;
        String expectest = "Fizz";
        String result = FizzBuzz.fizzBuzz(num);
        assertEquals(expectest,result);

    }

    @Test
    @DisplayName("Test : 5")
    public void testFizzBuzz5() {
        int num = 5;
        String expectest = "Buzz";
        String result = FizzBuzz.fizzBuzz(num);
        assertEquals(expectest,result);

    }

    @Test
    @DisplayName("Test : 7")
    public void testFizzBuzz7() {
        int num = 7;
        String expectest = "bảy";
        String result = FizzBuzz.fizzBuzz(num);
        assertEquals(expectest,result);

    }

    @Test
    @DisplayName("Test : 28")
    public void testFizzBuzz28() {
        int num = 28;
        String expectest = "haimươitám";
        String result = FizzBuzz.fizzBuzz(num);
        assertEquals(expectest,result);

    }


}