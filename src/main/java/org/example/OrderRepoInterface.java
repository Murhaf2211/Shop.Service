package org.example;

import java.util.List;

public interface OrderRepoInterface {
void add(Order order);
void removeOrder(Order order);
void getOrderId(int id);
void getAll();
}
