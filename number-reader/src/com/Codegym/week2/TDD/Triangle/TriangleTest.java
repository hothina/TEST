package com.Codegym.week2.TDD.Triangle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    @Test
    @DisplayName("2,2,2")
    public void howtriangle_2_2_2(){
        double a = 2;
        double b = 2;
        double c = 2;
        String expected = "Equilateral Triangle" ;
        String result = Triangle.whatTriangle(a,b,c) ;
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("2,2,3")
    public void howtriangle_2_2_3(){
        double a = 2;
        double b = 2;
        double c = 3;
        String expected = "Isosceles Triangle" ;
        String result = Triangle.whatTriangle(a,b,c) ;
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("3,4,5")
    public void howtriangle_3_4_5(){
        double a = 3;
        double b = 4;
        double c = 5;
        String expected = "Normal Triangle" ;
        String result = Triangle.whatTriangle(a,b,c) ;
        assertEquals(expected,result);
    }

}
