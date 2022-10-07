package org.example;

import lombok.Data;

import java.util.List;

@Data
public class ShopService {

  private OrderRepo  orderRepo ;
  private ProductRepo  productsRepo;

  public ShopService(OrderRepo orderRepo, ProductRepo productsRepo) {
        this.orderRepo = orderRepo;
        this.productsRepo = productsRepo;
    }

    public  void addOrder(int id, List<Product> products){
      Order newOrder = new Order(id,products);
      orderRepo.addOrder(newOrder);
      System.out.println("Neu Order erstellet => \n"+newOrder);
    }

    public OrderRepo getOrderRepo() {
        return orderRepo;
    }

    public void setOrderRepo(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public ProductRepo getProductsRepo() {
        return productsRepo;
    }

    public void setProductsRepo(ProductRepo productsRepo) {
        this.productsRepo = productsRepo;
    }
}
