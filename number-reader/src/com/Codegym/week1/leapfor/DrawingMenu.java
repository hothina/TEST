package com.Codegym.week1.leapfor;

import java.util.Scanner;

public class DrawingMenu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        while (choice != 0) {
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
//                case 0:
//                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
            System.out.println("muon tro ve mennu ko");
            System.out.println("1 yes, 2 no");
            choice = input.nextInt();
            if (choice==2){
                System.exit(2);
            }
        }


    }
}
