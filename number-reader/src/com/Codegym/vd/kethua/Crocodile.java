package com.Codegym.vd.kethua;

public class Crocodile implements IMarineAnimal, ITerrestrialAnimal {
    private int id;
    private int age;
    private String name;

    public Crocodile() {
    }

    public Crocodile(int id, int age, String name) {
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
        return "Crocodile";
    }

    @Override
    public void Swim() {
        System.out.println("Ca sau dang boi duoi nuoc");
    }

    @Override
    public void Run() {
        System.out.println("Ca sau dang chay tren bo");
    }
}
