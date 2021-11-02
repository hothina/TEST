package com.Codegym.weed4.threading.number;

public class NumberGenerator implements Runnable{
    String name;

    public NumberGenerator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0;i <10;i++){
            System.out.println(name+ ": "+ i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex){}
        }


    }
}
