package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    // Test Erste methode list all:
    @Test
    public void listAllProductsSuccess() {
        //GIVEN
        List<Product> testList = new ArrayList<>();

        Product seife = new Product(4, "Doveseife");
        Product shampoo = new Product(5, "Wella");
        Product zahnpasta = new Product(11, "Colgate");

        testList.add(seife);
        testList.add(shampoo);
        testList.add(zahnpasta);

        ProductRepo testRepo = new ProductRepo(testList);

        //WHEN
        List<Product> actual = testRepo.listAllProducts();
        System.out.println("Aktuell => " + actual);
        System.out.println("Erwartet => " + testList);

        //THEN
        assertArrayEquals(testList.toArray(), actual.toArray());

    }

    @Test
    public void listAllProductsFail() {
        //GIVEN
        List<Product> testList = new ArrayList<>();
        List<Product> testList2 = new ArrayList<>();

        Product seife = new Product(4, "Doveseife");
        Product shampoo = new Product(5, "Wella");
        Product zahnpasta = new Product(11, "Colgate");

        testList.add(seife);
        testList.add(shampoo);
        testList.add(zahnpasta);

        ProductRepo testRepo = new ProductRepo(testList);


        //WHEN
        List<Product> actual = testRepo.listAllProducts();
        System.out.println("Aktuell => " + actual);
        System.out.println("Erwartet => " + testList);

        //THEN
        assertArrayEquals(testList2.toArray(), actual.toArray());

    }


    @Test
    public void printOneProductSuccess() {
        //GIVEN
        List<Product> testList = new ArrayList<>();

        Product seife = new Product(4, "Doveseife");
        Product shampoo = new Product(5, "Wella");
        Product zahnpasta = new Product(11, "Colgate");


        testList.add(seife);
        testList.add(shampoo);
        testList.add(zahnpasta);

        ProductRepo testRepo2 = new ProductRepo(testList);

        //WHEN
        Product actual = testRepo2.getOneProduct(2);
        Product expected = testList.get(2);
        //THEN

        assertEquals(expected.getId(),actual.getId());
        assertEquals(expected.getName(),actual.getName());
        
    }
}
