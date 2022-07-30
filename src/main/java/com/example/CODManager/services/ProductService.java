package com.example.CODManager.services;

import com.example.CODManager.entities.Order;
import com.example.CODManager.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();
    Product getProduct(Long productId);
    Product createProduct(Product product);
    Product updateProduct(Long productId, Product product);
    void deleteProduct(Long productId);
}
