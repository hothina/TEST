package com.Codegym.vd.kethua;

public class Bird implements IOverHead{
    private int id;
    private int age;
    private String name;

    public Bird() {}

    public Bird(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
       return name;
    }

    @Override
    public String getType() {
        return "Bird";
    }

    @Override
    public void Fly() {
        System.out.println("dang bay");

    }
}
