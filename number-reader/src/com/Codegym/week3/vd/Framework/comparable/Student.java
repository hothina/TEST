package com.Codegym.week3.vd.Framework.comparable;



public class Student implements Comparable <Student> {
    private String name;
    private int age;
    private String addreess;

    public Student() {
    }

    public Student(String name, int age, String addreess) {
        this.name = name;
        this.age = age;
        this.addreess = addreess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddreess() {
        return addreess;
    }

    public void setAddreess(String addreess) {
        this.addreess = addreess;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }


    }




