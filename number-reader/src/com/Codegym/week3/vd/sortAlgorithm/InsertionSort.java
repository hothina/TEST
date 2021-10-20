package com.Codegym.week3.vd.sortAlgorithm;

public class InsertionSort {
    static int[] list = {1,5,7,2,4,5,8};
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < list.length; i++){ //đoạn array[0] đã sắp xếp
            x = list[i];
            pos = i;
            while(pos > 0 && x < list[pos-1]){
                list[pos] = list[pos-1]; // đổi chỗ
                pos--;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length ; i++) {
            System.out.print(list[i] + " ");
        }

    }

}
