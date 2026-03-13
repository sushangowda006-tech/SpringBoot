package com.example.demo.service;

import com.example.demo.entity.ProductEntity;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductEntity createProduct(ProductEntity product){

        double subtotal = product.getProductQuantity() * product.getProductMrp();
        double tax = subtotal * product.getProductTax() / 100;
        double total = subtotal + tax;

        product.setProductTotal(total);

        return productRepository.save(product);
    }

}