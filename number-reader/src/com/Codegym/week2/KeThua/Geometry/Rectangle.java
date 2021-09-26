package com.Codegym.week2.KeThua.Geometry;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(double width){
        return width;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getLength(double length){
        return length;
    }
    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length + super.toString() +
                '}';
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);

    }
}
