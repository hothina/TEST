package com.Codegym.week3.vd.Framework.ex.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {



    public ArrayList<Product> listproducts = new ArrayList<Product>();

    boolean isIdValid = false;


    Scanner scanner = new Scanner(System.in);

    public void add(Product product) throws Exception {
        //  product = getById(product.getId());
//        if (getById(product.getId()) == null)
        this.listproducts.add(product);
//        else
//        {System.out.println("ID  da ton tai!");}
    }

    public Product getById(int id) throws Exception {
        for (Product p : this.listproducts) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }




    public void edit() {
        System.out.print("Enter product id: ");
        int id = scanner.nextInt();

        for (Product p : this.listproducts) {
            if (p.getId() == id) {
                isIdValid = true;
                System.out.print("enter name:");
                p.setName(scanner.next());
                System.out.print("enter price");
                p.setPrice(scanner.nextInt());
                break;
            }
        }

        if (!isIdValid) {
            System.out.println("not find id");
        }


    }

    public void delete() {
        System.out.print("Enter product id");
        int id = scanner.nextInt();
        for (Product p : this.listproducts) {
            if (p.getId() == id) {
                isIdValid =true;
                this.listproducts.remove(p);
                break;
            }

        }
        if (!isIdValid){
            System.out.println("not find id");
        }

    }

    public void display(){
        for (Product p: this.listproducts) {
            System.out.println(p.toString());
        }
    }

    public void search(){
        System.out.print("Enter name ");

        String name = scanner.next();
        boolean isNameValid = false;

        for (Product p : this.listproducts) {
            if (p.getName().equalsIgnoreCase(name)) {
                isNameValid = true;
                System.out.println("product is: " + p.toString());
                break;
            }
        }
       if(!isNameValid){
           System.out.println("not find name");
       }
    }

    public void priceAscending(){
        if(this.listproducts.isEmpty()){
            System.out.println("There are no products in the list !");
        } else {
            PriceAscendingComparator priceAscendingComparator = new PriceAscendingComparator();
            Collections.sort(this.listproducts,priceAscendingComparator);
            System.out.println("PriceAscendingComparator");
            int i=1;
            for (Product p:this.listproducts) {
                System.out.println(i + ". " + p.toString());
                i++;
            }
        }
    }
    public void priceDecrease(){
        if(this.listproducts.isEmpty()){
            System.out.println("There are no products in the list !");
        } else {
            PriceDecreaseComarator priceDecreaseComarator = new PriceDecreaseComarator();
            Collections.sort(this.listproducts,priceDecreaseComarator);
            System.out.println("PriceDecreaseComparator");
            int i=1;
            for (Product p:this.listproducts) {

                System.out.println(i + ". " + p.toString());
                i++;
            }
        }
    }


}
