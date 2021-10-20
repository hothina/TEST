package com.Codegym.week3.vd.sortAlgorithm;

import java.util.Scanner;

import static com.Codegym.week3.vd.sortAlgorithm.SelectionSort.list;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("enter element" + list.length +"value" );
        for (int i = 0;i<list.length;i++){
            System.out.print("enter element ");
            list[i] = scanner.nextInt();
        }
        System.out.println("print list");
        for (int i=0; i<list.length;i++){
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortBySep(list);


    }

    public static void insertionSortBySep(int[] list){
        int pos, x;
        for(int i = 1; i < list.length; i++){ //đoạn array[0] đã sắp xếp
            x = list[i];
            pos = i;
            while(pos > 0 && x < list[pos-1]){
                System.out.println("Swap " + list[pos] + " with " + list[pos-1]);
                list[pos] = list[pos-1]; // đổi chỗ
                pos--;
            }
            list[pos] = x;
        }
        System.out.print("List after the sort: ");
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + "\t");
        }
        System.out.println();
    }
}
