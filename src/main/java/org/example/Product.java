package org.example;

public record Product(
        int id,
        String name,
        int price,
        String description,
        boolean available,
        int quantity) {
}
