package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    List<Product> products;
    public ProductRepo(){
        products = new ArrayList<>();
    }
    public void addProduct(Product product){
        products.add(product);
        System.out.println(product + " added");
    }
    public void deleteProduct(Product product){
        products.remove(product);
        System.out.println(product + " removed");
    }
    public boolean getById(int id){
        for(Product product : products){
            if (id == product.id()){
                System.out.println(product);
                break;
            }
        }
        return false;
    }
    public void getAll(){
        for(Product product : products){
            System.out.println(product);
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ProductRepo{");
        sb.append("products=").append(products);
        sb.append('}');
        return sb.toString();
    }
}
