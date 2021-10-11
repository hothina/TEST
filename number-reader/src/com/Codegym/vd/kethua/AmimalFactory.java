package com.Codegym.vd.kethua;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AmimalFactory {
    public static List<IAnimal> newInstaneAnimail() {
        List<IAnimal> animals = new ArrayList<>();
        animals.add(new Cat(1, 10, "Miumiu"));
        animals.add(new Crocodile(2, 10, "AKA"));
        animals.add(new Fish(3, 10, "BUIU"));
        animals.add(new Bird(4, 3, "Ary"));
        return animals;
    }

}
