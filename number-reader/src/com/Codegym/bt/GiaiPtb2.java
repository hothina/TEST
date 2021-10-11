package com.Codegym.bt;

import java.util.Scanner;

public class GiaiPtb2 {
  double a,b,c;
  public GiaiPtb2(){}

    public GiaiPtb2(double a, double b, double c) {
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
        Scanner sc = new Scanner(System.in);

        int choice ;
        System.out.println("Menu: giai pt bac 2");
        do {
            Double a,b,c;
            a=b=c=null;
            System.out.println("1. Nhap ba so a,b,c");
            System.out.println("2. Xac dinh nghiem");
            System.out.println("0. thoat");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Nhap ba so a,b,c");
                    System.out.print("\nnhap so a");
                    a = sc.nextDouble();
                    System.out.print("\nnhap so b");
                    b = sc.nextDouble();
                    System.out.print("\nnhap so c");
                    c = sc.nextDouble();

                case 2:
                    if(a==null&& b==null&& c==null)
                        continue;
                    System.out.print("Xac dinh nghiem:");
                    GiaiPtb2 giai = new GiaiPtb2(a,b,c);

                    if( giai.getDiscriminant()<0)
                        System.out.print("pt vo nghiem");
                    else if(giai.getDiscriminant()==0)
                        System.out.print("pt co nghiem kep x1=x2 = " +giai.getRoot1());
                    else
                        System.out.println("pt co 2 nghiem : x1 =" + giai.getRoot1() + " x2 = " +giai.getRoot2());

            }
        }while (choice!=0);



    }
}
