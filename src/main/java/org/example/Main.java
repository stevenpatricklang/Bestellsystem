package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {


        Product seife = new Product(1,"Doveseife");
        Product shampoo = new Product(2,"Wella");
        Product zahnpasta = new Product(3,"Colgate");

        List<Product> firstProduct = new ArrayList<>();
        firstProduct.add(seife);
        firstProduct.add(shampoo);
        firstProduct.add(zahnpasta);

// initilaize shoplager
        ProductRepo shoplager = new ProductRepo(firstProduct);



        System.out.println(shoplager.listAllProducts());
        System.out.println(shoplager.getOneProduct(1));
    }
}