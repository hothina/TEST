package com.Codegym.bt.thu2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TinhnghichDao {
    public static void main(String[] args) {
       int n;
        float sum = 0;
        Scanner sc = new Scanner(System.in);

        DecimalFormat decimalFormat =new DecimalFormat("#.##");
         do {
             System.out.print(" nhap vao so lon hon 1: ");
             n = sc.nextInt();
         }
         while (n<1);
         for (int i =1;i<=n;i++){
             sum += (float)1/i;
         }
        System.out.println("tong nghich dao: "+ decimalFormat.format(sum));
    }
}
