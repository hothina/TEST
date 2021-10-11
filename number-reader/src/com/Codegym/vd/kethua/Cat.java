package com.Codegym.vd.kethua;

public class Cat implements ITerrestrialAnimal {
    private int id;
    private int age;
    private String name;
    public Cat() {
    }

    public Cat(int id, int age, String name) {
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
    public String getType() {
        return "Cat";
    }

    @Override
    public void Run() {
        System.out.println("Dang chay");
    }
}
