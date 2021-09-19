package com.Codegym.week1.array;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int n, i, c;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập vào số phần tử của mảng:");
            n = scanner.nextInt();
        } while (n <= 0);

        int A[] = new int[n];
        System.out.println("nhập các phần tử cho mảng:");
        for (i = 0; i < n; i++) {
//            System.out.print("nhập phần tử thứ" + i + ":");
            A[i] = scanner.nextInt();
        }

        System.out.println("nhập số nguyên k:");
        int k = scanner.nextInt();
        for (c = i = 0; i < n; i++) {
            if (A[i] != k) {
                A[c] = A[i];
                c++;
            }
        }
        n = c;
        System.out.println("mảng còn lại sau khi xóa phần tử" + k + "là:");
        for (i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }

    }
}
