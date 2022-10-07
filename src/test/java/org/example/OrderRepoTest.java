package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderRepoTest {

    @Test
    public void listAllOrdersTest() {
        // GIVEN
        List<Product> products1 = new ArrayList<>();
        List<Product> products2 = new ArrayList<>();

        Product seife = new Product(4, "Doveseife");
        Product shampoo = new Product(5, "Wella");
        Product zahnpasta = new Product(11, "Colgate");

        products1.add(seife);
        products1.add(shampoo);
        products1.add(zahnpasta);

        products2.add(shampoo);
        products2.add(zahnpasta);

        Order order1 = new Order(1546, products1);
        Order order2 = new Order(16546, products2);

        List<Order> todayOrders = new ArrayList<>();
        todayOrders.add(order1);
        todayOrders.add(order2);

        OrderRepo orderRepo = new OrderRepo(todayOrders);

        // WHEN

        List<Order> expected = orderRepo.listAllOrders();
        List<Order> actual = todayOrders;

        // THEN
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

    @Test
    public void getOneOrderTest() {
        // GIVEN
        List<Product> products1 = new ArrayList<>();
        List<Product> products2 = new ArrayList<>();

        Product seife = new Product(4, "Doveseife");
        Product shampoo = new Product(5, "Wella");
        Product zahnpasta = new Product(11, "Colgate");

        products1.add(seife);
        products1.add(shampoo);
        products1.add(zahnpasta);

        products2.add(shampoo);
        products2.add(zahnpasta);

        Order order1 = new Order(1546, products1);
        Order order2 = new Order(16546, products2);

        List<Order> todayOrders = new ArrayList<>();
        todayOrders.add(order1);
        todayOrders.add(order2);

        OrderRepo orderRepo = new OrderRepo(todayOrders);

        // WHEN

        Order expected = orderRepo.getOneOrder(0);

        // THEN
        assertEquals(order1, expected);
    }

    @Test
    public void addOrderTest() {
        // GIVEN
        List<Product> products1 = new ArrayList<>();
        List<Product> products2 = new ArrayList<>();

        Product seife = new Product(4, "Doveseife");
        Product shampoo = new Product(5, "Wella");
        Product zahnpasta = new Product(11, "Colgate");

        products1.add(seife);
        products1.add(shampoo);
        products1.add(zahnpasta);

        products2.add(shampoo);
        products2.add(zahnpasta);

        Order order1 = new Order(1546, products1);


        List<Order> todayOrders = new ArrayList<>();
        todayOrders.add(order1);

        OrderRepo orderRepo = new OrderRepo(todayOrders);

        Order order2 = new Order(16546, products2);
        orderRepo.addOrder(order2);


        // WHEN

        Order expected = orderRepo.getOneOrder(1);

        //THEN

        assertEquals(order2,expected );
    }


}
