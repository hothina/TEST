package com.Codegym.bt;

import java.util.Scanner;

public class Fibonaci {

    public static int fibonaci(int n){
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        if(n<0){
            return -1;
        } else if(n==0|| n==1){
            return n;
        }else {
            for(int i = 2;i<n;i++){
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("số  cần in ra của dãy fibonaci: ");
        int number = sc.nextInt();
        for (int i=0; i<number; i++){
            System.out.print(fibonaci(i) + " ");
        }

        System.out.println("\n"+"dãy fibonaci nhỏ hơn số:");
        int num = sc.nextInt();
        int i =0;
        while (fibonaci(i)< num){
            System.out.print( fibonaci(i)+ " ");
            i++;
        }
    }
}
