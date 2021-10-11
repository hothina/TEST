package com.Codegym.bt.thu2;

import java.util.Scanner;

public class TongBinhPhuong {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("nhap vao so nguyen duong:");
            number = sc.nextInt();
        }
        while (number<1);
        for(int i=1; i<=number;i++){
            if(i%2!=0)
                sum += i*i;
        }
        System.out.println("tong binh phuong:" + sum);
    }
}
