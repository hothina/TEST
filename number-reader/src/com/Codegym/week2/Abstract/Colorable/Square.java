package com.Codegym.week2.Abstract.Colorable;

public class Square extends Shape implements Colorable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;

    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "A Square with side=" + getSide() + super.toString() + ", Area=" + getArea();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
