package com.Codegym.weed4.threading.number;

public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i <10;i++){
            System.out.print(" "+ i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex){}
        }

    }
}
