package com.Codegym.weed4.threading.oodEven;

public class Main {
    public static void main(String[] args) {
        OddThread numOdd = new OddThread();
        EvenThread numEven = new EvenThread();
        numOdd.start();
        try {
            numOdd.join(175);
        } catch (Exception e) {
            System.out.println(e);
        }
        numEven.start();
    }
}
