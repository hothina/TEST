package com.Codegym.bt;

import java.util.Scanner;

public class TimUocso {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so:");
        n = sc.nextInt();
        for (int i = 1; i<=n;i++){
            if(n%i==0){
                System.out.print(i + " ");
            }

        }
    }
}
