package com.Codegym.week1.array;

import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        int[] list;
        int size;
        Scanner sc = new Scanner(System.in);
       do {
           System.out.print("nhap so luong mang");
           size = sc.nextInt();
           if(size> 20)
               System.out.print("khong duoc lon hon 20");
       } while (size>20);
           list = new int[size];
           int i = 0;
           while (i<list.length){
               System.out.print("nhap pt"+ (i+1) +": ");
               list[i] = sc.nextInt();
               i++;
           }
        System.out.println("mang");
           for(int j =0; j<list.length; j++){

           }



    }
    }

