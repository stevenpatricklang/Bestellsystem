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

    // Method
    public Product getOneProduct(int index){
       return productsStorage.get(index);
    }

}
