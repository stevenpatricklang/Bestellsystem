package org.example;

import lombok.Data;

import java.util.List;

@Data
public class Order {

    private int orderId;

    private List<Product> productsInOrder;



    //Konstruktor
    public Order (int orderId, List<Product> orderedProducts){
        this.orderId = orderId;
        this.productsInOrder = orderedProducts;
    }

    public List<Product> getProductsInOrder() {
        return productsInOrder;
    }

    public void setProductsInOrder(List<Product> productsInOrder) {
        this.productsInOrder = productsInOrder;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}

