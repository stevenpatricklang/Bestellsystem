package org.example;


import java.util.List;

public class OrderRepo {

        private List<Order> OrderList;

        // Konstruktor
        public OrderRepo(List<Order> storedOrder) {
            this.OrderList = storedOrder;
        }

        //Method: list all orders
        public List<Order> listAllOrders(){
            return OrderList;
        }

        // Method
        public Order getOneOrder(int index){
            return OrderList.get(index);
        }
        public void addOrder(Order newOrder){
             OrderList.add(newOrder);
        }

    }

