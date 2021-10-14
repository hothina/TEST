package com.Codegym.week3.vd.Framework.ex.Product;

import com.Codegym.week3.vd.Framework.comparable.Student;

import java.util.Comparator;

public class PriceAscendingComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        if(product1.getPrice()>product2.getPrice()){
            return 1;
        } else if(product1.getPrice()==product2.getPrice()){
            return 0;
        }else {
            return -1;
        }
    }


}
