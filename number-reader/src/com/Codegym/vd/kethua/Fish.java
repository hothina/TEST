package com.Codegym.vd.kethua;

public class Fish implements IMarineAnimal{

    private int id;
    private int age;
    private String name;
    public Fish() {
    }

    public Fish(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public void Swim() {
        System.out.println(" ca Dang Boi duoi nuoc");
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
        return "Fish";
    }
}
