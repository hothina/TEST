package com.Codegym.week1.OOP;

import java.util.Scanner;

public class QuadracticEquation {
  double a, b, c;
  public QuadracticEquation(){
  }

    public QuadracticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
      double delta = Math.pow(b,2) -4*a*c;
      return delta;
    }

    public double getRoot1(){
      double r1 = ((-b) - Math.pow(getDiscriminant(),0.5))/2*a;
      return r1;
    }

    public double getRoot2(){
      double r2 = ((-b) + Math.pow(getDiscriminant(),0.5))/2*a;
      return r2;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so a ");
        double a = scanner.nextDouble();
        System.out.print("nhap so b ");
        double b = scanner.nextDouble();
        System.out.print("nhap so c ");
        double c = scanner.nextDouble();

        QuadracticEquation quadracticEquation = new QuadracticEquation(a,b,c);
        if(quadracticEquation.getDiscriminant()<0)
            System.out.println("pt vo nghiem");
        if(quadracticEquation.getDiscriminant()==0)
            System.out.println("pt co nghiem kep" + quadracticEquation.getRoot1());
        if(quadracticEquation.getDiscriminant()>0)
            System.out.println("pt co 2 nghiem " + quadracticEquation.getRoot1() + ", " + quadracticEquation.getRoot2());


    }


}
