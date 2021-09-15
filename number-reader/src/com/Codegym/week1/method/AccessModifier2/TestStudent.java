package com.Codegym.week1.method.AccessModifier2;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Tony");
        student.setClasses("B05");
        System.out.println(student.toString());
    }
}
