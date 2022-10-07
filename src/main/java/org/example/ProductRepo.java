package org.example;
import java.util.List;



public class ProductRepo {

    private List<Product> productsStorage;

    // Konstruktor
    public ProductRepo(List<Product> storedProduct) {
        this.productsStorage = storedProduct;
    }

    //Method: list all products
    public List<Product> listAllProducts(){
        return productsStorage;
    }

    // Method: get one Product
    public Product getOneProduct(int index){


       if (index >= productsStorage.size()){
           throw new IllegalArgumentException ("Produkt nicht gefunden");
       }

        return productsStorage.get(index);

    }

}
