package com.Codegym.bt.thu2;

import java.util.Scanner;

public class UclnBcnn {
    public static int Ucln(int a, int b){
        while (a != b){
            if(a>b)
                a = a - b;
            else
                b = b-a;
        }

        return b;
    }
    public static int Bcnn(int a, int b){
        return (a*b)/Ucln(a,b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so a:");
        int a = sc.nextInt();
        System.out.print("nhap so b:");
        int b = sc.nextInt();
        System.out.println("UCLN  " + Ucln(a,b) + "BCNN "+ Bcnn(a,b));

    }

}
