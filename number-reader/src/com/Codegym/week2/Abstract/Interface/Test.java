package com.Codegym.week2.Abstract.Interface;


public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
//                Edible edibler = (Chicken) animal;
//                System.out.println(edibler.howToEat());
                Edible edibleObj = new Edible() {
                    @Override
                    public String howToEat() {
                        return "can eat";
                    }
                };
                System.out.println(edibleObj.howToEat());

            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }

    }
}
