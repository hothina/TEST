package com.Codegym.week1.OOP.StopWatch;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public int[] sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
        return array;
    }

//public void BubbleSort(){
//        int[] array = initArray();
//        for( int i = 0; i<array.length -1; i++){
//            for(int j = array.length -1; j>i; j--){
//                if(array[j]<array[j-1]){
//                   int temp = array[j-1];
//                   array[j-1] = array[j];
//                   array[j] = temp;
//
//                }
//            }
//        }
//    }

//    public void swap(int[] a, int j, int min_index) {
//        int temp = a[j];
//        a[j] = a[min_index];
//        a[min_index] = temp;
//    }

    public int[] initArray() {

        int[] array = new int[10000];
        for (int i = 0; i < 10000; i++) {
            array[i] = (int) (Math.random()*1000);
            System.out.print(array[i] +", ");
        }
        return array;
    }

}
