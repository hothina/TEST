package com.Codegym.weed4.threading.number;

public class Main {
    public static void main(String[] args) {
        NumberGenerator thread1 = new NumberGenerator();
        NumberGenerator thread2 = new NumberGenerator();

        Thread th1 = new Thread(thread1);
        Thread th2 = new Thread(thread2);

        th1.setPriority(Thread.MAX_PRIORITY);
        th2.setPriority(Thread.MIN_PRIORITY);

        th1.start();

        th2.start();


    }
}
