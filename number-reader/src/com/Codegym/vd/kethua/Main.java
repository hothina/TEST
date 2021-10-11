package com.Codegym.vd.kethua;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        List<IAnimal> animals = AmimalFactory.newInstaneAnimail();
//        for (IAnimal animal: animals) {
//            System.out.println(animal.getName() + " " + animal.getAge()+" "+animal.getType());
//            if(animal instanceof IMarineAnimal)
//                ((IMarineAnimal)animal).Swim();
//            if(animal instanceof ITerrestrialAnimal)
//                ((ITerrestrialAnimal)animal).Run();
//            if(animal instanceof IOverHead)
//                ((IOverHead)animal).Fly();
//
//        }
        int number;
        IAnimal animal;
        //nhap mot so
        //neu so la chan thi tao mot doi tuong Bird
        //neu la le tao 1 doi tuong tren Ca sau
        Scanner scanner= new Scanner(System.in);
        System.out.print("nhap 1 so");
        number = scanner.nextInt();
        if(number% 2==0){
             animal=new Bird(6, 1, "An");


        } else {
            animal = new Crocodile(7,7,"Ben");

        }
        System.out.println("Animal: ID" + animal.getId() +", Age"+ animal.getAge()+ ", Name" + animal.getName());


    }
}
