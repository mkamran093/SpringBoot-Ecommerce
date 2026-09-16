package com.kamran.ECommerce.service;

import com.kamran.ECommerce.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    List<Product> products = List.of(
            new Product(1, "Product 1", 100),
            new Product(2, "Product 2", 200),
            new Product(3, "Product 3", 300)
    );

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Product saveProduct(Product product) {
        products.add(product);
        return product;
    }
}
