package com.Codegym.week2.TDD.Triangle;

public class Triangle {
    public static String whatTriangle(double a, double b, double c){
      boolean isTriangle = ((a + b > c) && (a + c > b) && (b + c > a) &&
              (a > 0) && (b > 0) && (c > 0));
      boolean isEquilateralTriangle = ((a == b) && (b == c));
      boolean isIsoscelesTriangle = ((a == b) || (a == c) || (b == c));
      boolean isRightTriangle = ((a * a == b * b + c * c) || (b * b == a * a + c * c)
              || (c * c == b * b + a * a));

      if(!isTriangle) return "Not is triangle";
      if(isEquilateralTriangle) return "Equilateral Triangle";
      if(isIsoscelesTriangle) return "Isosceles Triangle";
      if(isRightTriangle) return "Right Triangle";
      return "Normal Triangle";

    }
}
