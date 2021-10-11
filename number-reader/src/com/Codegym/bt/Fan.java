package com.Codegym.bt;

import java.util.Scanner;


public class Fan {
  private int speed = 1;
  private boolean on = false;
  private double radius = 5;
  private String color = "blue";

    public Fan() {}

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SLOW = 1;
        int MEDIUM = 2;
        int FAST = 3;
        Fan fan1 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");
       Fan fan2 = new Fan();
        fan2.setSpeed(MEDIUM);
        fan2.setOn(false);

        System.out.println("fan1" + fan1.toString());
        System.out.println("fan2" + fan2.toString());
    }
}
