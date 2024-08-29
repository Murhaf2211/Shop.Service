package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderMapRepo implements OrderRepoInterface {
    private Map<Integer, Order> orderMap;

    public OrderMapRepo() {
        this.orderMap = new HashMap<>();
    }

    @Override
    public void add(Order order) {
        orderMap.put(order.id(), order);
    }

    @Override
    public void removeOrder(Order order) {
        orderMap.remove(order.id(), order);
    }

    @Override
    public void getOrderId( int id) {
        Order order = orderMap.get(id);
        System.out.println(order);
    }

    @Override
    public void getAll() {
        List.copyOf(orderMap.values());
    }
}
