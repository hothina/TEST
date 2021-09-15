package com.Codegym.week1.OOP.StopWatch;

public class StopWatch {
    private long startTime;
    private long endTime;
    private boolean counting = false;

    public StopWatch(){
    }

    public void Start(){
        this.startTime = System.currentTimeMillis();
        this.counting = true;
    }

    public void End(){
        this.endTime = System.currentTimeMillis();
        this.counting = false;
    }

    public long getElapsedTimeSecs() {
        long elapsed;
        if (counting) {
            elapsed = ((System.currentTimeMillis() - startTime) / 1000);
        }
        else {
            elapsed = ((endTime - startTime) / 1000);
        }
        return elapsed;
    }
}
