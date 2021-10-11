package com.Codegym.week2.KeThua.Geometry;

public class Parallelogram extends Shape{
    private double widht;
    private double leght;
    private double height;


    public Parallelogram(){}

    @Override
    double getArea() {
        return (leght*height);
    }


    public Parallelogram(double widht, double leght,double height){
        this.leght = leght;
        this.widht = widht;
        this.height = height;
    }

    public Parallelogram(String color, boolean filled, double widht, double leght, double height){
        super(color,  filled);
        this.widht = widht;
        this.leght = leght;
        this.height = height;

    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public double getLeght() {
        return leght;
    }

    public void setLeght(double leght) {
        this.leght = leght;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double getPerimeter() {
        return (widht + leght)*2;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "widht=" + widht +
                ", leght=" + leght +
                ", height=" + height +
                ", chu vi:" + getPerimeter() +
                ", diện tích" +  getArea() +", "+
                super.toString()+
                '}';
    }

    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram(3, 5, 4);
        System.out.println(parallelogram);

        parallelogram = new Parallelogram( 4,6,5);
        System.out.println(parallelogram);



    }
}
