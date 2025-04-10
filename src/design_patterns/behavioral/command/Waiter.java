package design_patterns.behavioral.command;

import java.util.*;

//Invoker
public class Waiter {
    private ArrayList<Order> listOfOrders = new ArrayList<Order>();

    public void takeOrder(Order order) {
        this.listOfOrders.add(order);
        System.out.println("Waiter is taking a new order: " + order);
    }

    public void executeOrders(){
        for (Order order:this.listOfOrders)
            order.execute();
    }
}
