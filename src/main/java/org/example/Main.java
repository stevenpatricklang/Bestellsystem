package org.example;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);







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

        Order orderNr156 = new Order(156,List.of(seife));
        Order orderNr1589 = new Order(1589,List.of(seife,shampoo,zahnpasta));

        List<Order> ordersList = new ArrayList<>();

        ordersList.add(orderNr156);
        ordersList.add(orderNr1589);


        OrderRepo orderRepo= new OrderRepo(ordersList);

        ShopService  shopService = new ShopService(orderRepo,shoplager);

        Product shampooMode213 = new Product(297,"Wella erqew");
        Product zahnpastaModel2 = new Product(5983,"Colgate 484");

        System.out.println("Enter new Id: ");
        int inputId = scanner.nextInt();
        System.out.println("Enter Product name:  ");
        String productname= scanner.nextLine();

        Product scannerProduct= new Product(inputId,productname);


        shopService.addOrder(inputId, List.of(scannerProduct));


        shopService.addOrder(1547, List.of(shampooMode213,zahnpastaModel2));
        System.out.println("All Orders => \n"+shopService.getOrderRepo().listAllOrders());

        System.out.println(shoplager.getOneProduct(789));


    }
}