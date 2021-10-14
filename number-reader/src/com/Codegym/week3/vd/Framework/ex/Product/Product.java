package com.Codegym.week3.vd.Framework.ex.Product;

import java.text.DecimalFormat;

public class Product {
   private int id;
   private String name;
   private int price;

   public Product(){}

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("###,###,###");

        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + format.format(price) +"VND"+
                '}';
    }
}
