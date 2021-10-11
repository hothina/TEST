package com.Codegym.bt;

import java.util.Scanner;

public class LuyenTap {
    public static int giaithua(int n){
        int giaithua = 1;

        for (int i = n; i > 1; i--) {
            giaithua *= i;


        }
        return giaithua;

    }
    public static boolean ischiahetcho5(int num){
        if(num%5==0)
            return true;
        return false;
    }


    public static void main(String[] args) {
//        int n=5;
//
//        System.out.println("giai thua cua n " + giaithua(5));
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap so bat dau");
//        int number = sc.nextInt();
//        System.out.print(" nhap so tong");
//        int a =sc.nextInt();
//        int count =0;
//        int sum =0;
//
//        while (count<a){
//            if(ischiahetcho5(number)){
//                sum += number;
//                count++;
//
//            }
//            number++;
//
//
//        }
//        System.out.print(sum);
//
//
//



        int N=6753;
        String s= Integer.toString(N);
        System.out.println(s.length());
        int sum  = 0;
        for (int i =0; i<s.length();i++){
            String numOfString = String.valueOf(s.charAt(i));
            sum += Integer.parseInt(numOfString);

        }



    }
}
