package com.Codegym.week1.OOP.Fan;

public class Fan {
   private int Speed = 1;
   private boolean isOn = false;
   private String Color = " blue";
   private double radius = 5;

   public Fan(){}

   public Fan(int speed, boolean isOn, String color, double radius) {
      Speed = speed;
      this.isOn = isOn;
      Color = color;
      this.radius = radius;
   }

   public int getSpeed() {
      return Speed;
   }

   public void setSpeed(int speed) {
      Speed = speed;
   }

   public boolean isOn() {
      return isOn;
   }

   public void setOn(boolean on) {
      isOn = on;
   }

   public String getColor() {
      return Color;
   }

   public void setColor(String color) {
      Color = color;
   }

   public double getRadius() {
      return radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   @Override
   public String toString() {
      return "Fan{" +
              "Speed=" + Speed +
              ", isOn=" + isOn +
              ", Color='" + Color + '\'' +
              ", radius=" + radius +
              '}';
   }
}
