package com.Codegym.week1.day1;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {

        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("mời bạn nhập số tiền USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.print("giá trị VNĐ: " + quydoi);
    }
}
