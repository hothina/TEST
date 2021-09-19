package com.Codegym.week2.CleanCode.Refactoring;

public class CalculatorTest {
    public static void main(String[] args) {
        int firstOperand = 1;
        int secondOperand = 3;
        char operator = '+';
        int expected = 2;
        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        if (result == expected) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
