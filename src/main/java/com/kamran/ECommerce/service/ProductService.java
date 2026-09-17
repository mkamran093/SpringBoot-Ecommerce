package com.kamran.ECommerce.service;

import com.kamran.ECommerce.model.Product;
import com.kamran.ECommerce.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

//    List<Product> products = List.of(
//            new Product(1, "Product 1", 100),
//            new Product(2, "Product 2", 200),
//            new Product(3, "Product 3", 300)
//    );

    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }

}
