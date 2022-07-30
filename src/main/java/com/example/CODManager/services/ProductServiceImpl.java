package com.example.CODManager.services;

import com.example.CODManager.entities.Product;
import com.example.CODManager.repositories.ProductRepository;

import java.util.List;

public class ProductServiceImpl implements ProductService{

    ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(Long productId) {
        return productRepository.findById(productId).get();
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long productId, Product product) {

        Product currentProduct= this.getProduct(productId);
        currentProduct.setProductName(product.getProductName());
        currentProduct.setPrice(product.getPrice());

        return productRepository.save(currentProduct);
    }

    @Override
    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }
}
