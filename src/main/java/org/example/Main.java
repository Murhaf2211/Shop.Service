package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        ProductRepo repo = new ProductRepo();
        Product product1 = new Product(01,"HP Laptop",550,"Hp laptop Descriptions",true ,20);
        Product product2 = new Product(02,"Dell Laptop",500,"Dell laptop Descriptions",false,0);
        Product product3 = new Product(03,"Lenovo Laptop",600,"Lenovo Laptop Descriptions",true ,10);
        Product product4 = new Product(04,"MacBook",1000,"MacBook Descriptions",false,0);
        Product product5 = new Product(05,"Asus Laptop",700,"Asus Laptop Descriptions",true, 30);

        repo.addProduct(product1);
        repo.addProduct(product2);
        repo.addProduct(product3);
        repo.addProduct(product4);
        repo.addProduct(product5);
        System.out.println("----------");
        repo.getAll();
        System.out.println("----------");
        repo.deleteProduct(product4);
        System.out.println("----------");
        repo.getById(02);
        System.out.println("----------");
        repo.getAll();

        System.out.println("----------");
        System.out.println("----------");

        Order order1 = new Order(11, "55f","02.10.2013", product1,2);
        Order order2 = new Order(12, "65f","02.11.2013", product1,1);
        Order order3 = new Order(13, "75f","13.05.2013", product3,3);
        OrderListRepo orderRepo = new OrderListRepo();
        orderRepo.add(order1);
        orderRepo.add(order2);
        orderRepo.add(order3);
        System.out.println("----------");
        orderRepo.getAll();
        System.out.println("----------");
        orderRepo.removeOrder(order2);
        System.out.println("----------");
        orderRepo.getOrderId(11);
        System.out.println("----------");
        System.out.println("----------");
        ShopService shopService = new ShopService(repo, orderRepo);
        Order order = new Order(33, "z334","22.06.2023",product5,2);
        shopService.placeOrder(order);
        System.out.println("----------");
        System.out.println(shopService);

    }
}