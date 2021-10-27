package com.Codegym.weed4.IObinaryFile.product;

import com.Codegym.weed4.IObinaryFile.student.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Iphone","apple",10000000));
        products.add(new Product(2,"Nokia","Nokia",3230000));
        products.add(new Product(3,"Galaxy","Samsung",5100000));
        writeToFile("product.txt",products);
        List<Product> productDataFromFile = readDataFromFile("product.txt");
        for ( Product product : products){
            System.out.println(product);
        }
    }

    public static void writeToFile(String path, List<Product> products){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static List<Product> readDataFromFile(String path){
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex){
            ex.getStackTrace();
        }
        return products;
    }


}
