package com.Codegym.week2.KeThua.Point2;

public class MovableTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1.2f, 5.2f, 2.3f, 2.5f);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
