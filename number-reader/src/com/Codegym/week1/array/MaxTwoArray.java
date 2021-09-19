package com.Codegym.week1.array;

import java.util.Scanner;

public class MaxTwoArray {
    public static void main(String[] args) {
        int [][] matrix= new int[2][4];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Enter the Element : " + "[" + i + "]" + "[" + j +"]");
                matrix[i][j] = input.nextInt();
            }
        }
        int max = matrix[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.print("The max Element in two-dimensional array is: " +max);
    }
}
