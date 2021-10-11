package com.Codegym.bt;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");

        while (choice!=0){
            System.out.println("1. Print the retangle");
            System.out.println("2. Print triangle botton-left ");
            System.out.println("3. Print triangle top-left ");
            System.out.println("4. Print triangle top-right ");
            System.out.println("5. Print triangle top-right");
            System.out.println("0. Exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Print the retangle");
                    for(int i=1;i<4;i++){
                        for (int j=1;j<8;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println(" Print  triangle botton-left");
                    for(int i= 1;i<6;i++){
                        for(int j =1;j<i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                    }
                    break;
                case 3:
                    System.out.println(" Print triangle top-left ");
                    for(int i=0; i<6; i++){
                        for(int j=0;j<i;j++){
                            System.out.print("");
                        }
                        for(int k =0;k<i;k++){
                            System.out.print("*");
                        }

                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println(" Print triangle button-right");
                    for(int i=0;i<5;i++){
                        for(int j=0; j<4;j++){
                            System.out.print(" ");
                        }
                        for (int k=0;k<i; k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println(" Print triangle top-right");
                    for(int i=0; i<7;i++){
                        for(int j= 0;j<7;j++){
                            System.out.print(" ");
                        }
                        for(int k =6;k<i;k--){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("nhap lai");

            }
        }
    }
}
