package org.example;

import lombok.Data;

@Data
public class Product {

    private int id;
    private String name;

    //Konstruktor
    public Product(int id, String name){
        this.id = id;
        this.name = name;
    }
}
