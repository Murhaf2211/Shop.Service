package org.example;

import java.util.List;

public record Order(
        int id,
        String orderNumber,
        String dateOfOrder,
        Product product,
        int quantity) {
    public List<Product> products() {
        return List.of(product);
    }
}
