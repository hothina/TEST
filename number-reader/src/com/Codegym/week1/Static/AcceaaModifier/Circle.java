package com.Codegym.week1.Static.AcceaaModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double r) {
       radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = radius * radius * Math.PI;
        return area;
    }
}
