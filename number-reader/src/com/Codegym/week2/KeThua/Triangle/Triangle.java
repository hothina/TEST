package com.Codegym.week2.KeThua.Triangle;

public class Triangle extends Shape {
    double size1 = 1.0;
    double size2 = 1.0;
    double size3 = 1.0;
    public Triangle(){}

    public Triangle(String color, boolean filled, double size1, double size2, double size3) {
        super(color, filled);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public Triangle(double size1, double size2, double size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

}
