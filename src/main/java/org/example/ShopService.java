package org.example;
import java.util.List;

public class ShopService {
    private ProductRepo productRepo;
    private OrderListRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderListRepo orderRepo){
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }
    public void placeOrder(Order order) {
        List<Product> orderedProducts = order.products();
        for (Product product : orderedProducts) {
            if (productRepo.getById(product.id())) {
                System.out.println("Product with ID " + product.id() + " does not exist.");
                return;
            }
        }
        orderRepo.add(order);
        System.out.println("Order placed successfully.");
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ShopService{");
        sb.append("productRepo=").append(productRepo);
        sb.append(", orderRepo=").append(orderRepo);
        sb.append('}');
        return sb.toString();
    }
}
