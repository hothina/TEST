package com.Codegym.week3.vd.Framework.ex.Product;


import java.util.Scanner;

public class TestProductM {

    static void menu() {
        System.out.println("Menu");
        System.out.println("1. Add product");
        System.out.println("2. Edit product");
        System.out.println("3. Delete product");
        System.out.println("4. Display product");
        System.out.println("5. Search product");
        System.out.println("6. Ascending list by price");
        System.out.println("7. Decrease list by prise");
        System.out.println("8. Exit");

    }

    public static void main(String[] args) throws Exception {
        ProductManager productManager = new ProductManager();
        Product ban = new Product(1, "Banhoc", 100000);
        Product ghe = new Product(2, "ghedai", 500000);
        Product cua = new Product(3, "cuago", 600000);
        productManager.add(ban);
        productManager.add(ghe);
        productManager.add(cua);
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String choice = "-1";



        while (!choice.equals("0")) {
            menu();
            System.out.print("please enter number ");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    Product product = addProduct(productManager, scanner);
                    if (product != null)
                        productManager.add(product);
                    break;
                case "2":
                    System.out.println("Edit product");
                    productManager.edit();
                    break;
                case "3":
                    System.out.println("Delete product");
                    productManager.delete();
                    break;
                case "4":
                    System.out.println("Display product");
                    productManager.display();
                    break;
                case "5":
                    System.out.println("Search product");
                    productManager.search();
                    break;
                case "6":
                    System.out.println("Ascending list by price");
                    productManager.priceAscending();
                    break;
                case "7":
                    System.out.println("Decrease list by prise");
                    productManager.priceDecrease();
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println(" please enter number");
                    break;
            }
        }
    }

    private static Product addProduct(ProductManager productManager, Scanner scanner) throws Exception {
        System.out.println("Add product");

        System.out.print("Enter product id: ");
        int id = scanner.nextInt();
        if (productManager.getById(id) != null) {
            System.out.println("ID  da ton tai!");
            return null;
        }

        System.out.print("Enter product price: ");
        int price = scanner.nextInt();
        System.out.print("Enter product name: ");
        String name = scanner.next();

        Product product = new Product(id,name,price);
//        product.setId(id);
//        product.setName(name);
//        product.setPrice(price);

        return product;
    }
}
