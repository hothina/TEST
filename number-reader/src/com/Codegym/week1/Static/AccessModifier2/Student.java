package com.Codegym.week1.Static.AccessModifier2;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student(){}
   protected void setName(String name) {
        this.name = name;
    }
   protected void setClasses(String classes) {
        this.classes = classes;
    }
    public String toString() {
        String str;
        str = "Name's student is " + this.name + " classes is "+this.classes;
        return str;
    }
}
