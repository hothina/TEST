package com.Codegym.week1.OOP.StopWatch;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
//        watch.start();
//        watch.sort(watch.initArray());
//        watch.stop();
//        System.out.println(watch.getElapsedTime());
        watch.start();
        int[] array = watch.initArray();
      int[] arr = watch.sort(array);
        System.out.println("\n");
        for (int i =0; i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        watch.stop();
        System.out.println("\n");
        System.out.println(watch.getElapsedTime());

    }
}
