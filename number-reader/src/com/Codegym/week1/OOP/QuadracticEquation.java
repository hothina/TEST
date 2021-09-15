package com.Codegym.week1.OOP;

import java.util.Scanner;

public class QuadracticEquation {
    double a, b, c;

    public QuadracticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, delta;
        System.out.println("Input Quadratic Equation !");
        do {
            System.out.print("Input a: ");
            a = scanner.nextDouble();
            if (a == 0) {
                System.out.println("Input a != 0 !");
            }
        } while (a == 0);

        System.out.print("Input b: ");
        b = scanner.nextDouble();
        System.out.print("Input c: ");
        c = scanner.nextDouble();
        QuadracticEquation X = new QuadracticEquation(a, b, c);
        delta = X.getDiscriminant();
        if (delta > 0) {
            System.out.println("The equation has 2 constraints : " + (-b + Math.sqrt(delta)) / (2 * a) + " and " + (-b - Math.sqrt(delta)) / (2 * a));
        } else if (delta == 0) {
            System.out.println("The equation with 1 solution is: " + (-b / (2 * a)));
        } else {
            System.out.println("The equation has no solution!");
        }
    }
}
