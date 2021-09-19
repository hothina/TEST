package com.Codegym.week2.Abstract.Resizeable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1.0, "red", false);
        shapes[1] = new Rectangle(2.3, 1.2, "blue", true);
        shapes[2] = new Square(3.6, "pink", false);
        for (Shape shape: shapes) {
            System.out.println(shape);
        }
        for (Shape a : shapes) {
            a.resize(Math.random()*100);
        }
        System.out.println("\n");
        Shape.printShape(shapes);
    }
}
