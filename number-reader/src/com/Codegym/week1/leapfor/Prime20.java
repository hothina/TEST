package com.Codegym.week1.leapfor;

import java.util.Scanner;

public class Prime20 {
    public static Boolean chekPrime(int a){

        if (a < 2 ){
            return false ;
        }else {
            int i = 2;
            while (i <= Math.sqrt(a))  {
                if (a % i == 0){
                    return false ;
                }
                i++;
            }
            return true;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số bắt đầu : ");
        int number = scanner.nextInt() ;
        System.out.print("Nhập số lượng các số nguyên tố cần in ra : ");
        int  num = scanner.nextInt() ;
        int count = 0  ;
        String str = num + " số nguyên tố bắt đầu từ " + number + " là: ";
        while (count < num) {
            if (chekPrime(number) ) {
                count ++ ;
                str += number + ", " ;
            }
            number ++ ;
        }
        System.out.println(str);
    }
}
