package com.Codegym.week3.vd.Framework.ex.Product;

import java.util.*;

import static com.Codegym.week3.vd.Framework.ex.Product.TestProductM.menu;

public class ProductManager {



    public ArrayList<Product> listproducts = new ArrayList<Product>();

    boolean isIdValid = false;


    Scanner scanner = new Scanner(System.in);

    public void add(Product product) throws Exception {

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

    public void edit() throws Exception {
        System.out.print("Enter product id: ");
        int id = scanner.nextInt();

        Product p = getById(id) ;
        if (p!=null) {
            String choice;
            do{
                System.out.println("menu edit product");
                System.out.println("1. Edit name product ");
                System.out.println("2. Edit price product");
                System.out.println("3. Exit");

                choice = scanner.next();
                switch (choice){
                    case "1":
                        System.out.println("enter name");
                        p.setName(scanner.next());
                        break;
                    case "2":
                        System.out.println("enter price");
                        p.setPrice(scanner.nextInt());
                        break;
                    case "3":
                        menu();
                        break;

                }

            } while (!choice.equals("3"));
        } else {
            System.out.println("not find id");
        }

//        for (Product p : this.listproducts) {
//            if (p.getId() == id) {
//                isIdValid = true;
//                System.out.print("enter name:");
//                p.setName(scanner.next());
//                System.out.print("enter price");
//                p.setPrice(scanner.nextInt());
//                break;
//            }
//        }

//        if (!isIdValid) {
//            System.out.println("not find id");
//        }


    }

    public void delete() throws Exception {
        System.out.print("Enter product id");
        int id = scanner.nextInt();
        Product p = this.getById(id) ;

        if(p!=null){
            this.listproducts.remove(p);
        }  else {
            System.out.println("not find id");
        }
//        for (Product p : this.listproducts) {
//            if (p.getId() == id) {
//                isIdValid =true;
//                this.listproducts.remove(p);
//                break;
//            }
//
//        }
//        if (!isIdValid){
//            System.out.println("not find id");
//        }

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
            this.listproducts.sort(priceAscendingComparator);
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
            this.listproducts.sort(priceDecreaseComarator);
            System.out.println("PriceDecreaseComparator");
            int i=1;
            for (Product p:this.listproducts) {

                System.out.println(i + ". " + p.toString());
                i++;
            }
        }
    }


}
