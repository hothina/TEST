package com.Codegym.weed4.string.className;

public class NameTest {
    static String[] arr= {"C0879G","k2345L","A2345M"};

    public static void main(String[] args) {
        Name check = new Name();
        for (String name: arr){
            if (check.isNameRegex(name)){
                System.out.println("is class name");
            } else
            System.out.println("is not class name");
        }
    }
}
