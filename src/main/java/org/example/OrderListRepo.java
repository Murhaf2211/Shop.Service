package org.example;

import java.util.ArrayList;
import java.util.List;


public class OrderListRepo {
    List<Order> orders;

    public OrderListRepo() {
        orders = new ArrayList<>();
    }

    public void add(Order order) {
        orders.add(order );
        System.out.println(order + " added");
    }
    public void removeOrder(Order order) {
        orders.remove(order);
        System.out.println(order + " removed");
    }
    public void getOrderId(int id){
        for(Order order : orders){
            if (id == order.id()){
                System.out.println(order);
                break;
            }
        }
    }
    public void getAll(){
        for(Order order : orders){
            System.out.println(orders);
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("OrderListRepo{");
        sb.append("orders=").append(orders);
        sb.append('}');
        return sb.toString();
    }
}
