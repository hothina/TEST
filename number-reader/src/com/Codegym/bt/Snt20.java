package com.Codegym.bt;

import java.util.Scanner;

public class Snt20 {
    public static boolean isSnt(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        } return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số bắt đầu ");
        int number = scanner.nextInt();
        System.out.print("nhập số lượng snt cần in ra");
        int n = scanner.nextInt();
        int count = 0;
      //  int i =2;
        String str = n + " số nguyên tố bắt đầu từ " + number + " là: ";
        while (count< n){
            if(isSnt(number)){
           //     System.out.println(i +" ");
                count++;
                str +=  number+" ";

            }
            number++;
        }
        System.out.println(str);

    }
}