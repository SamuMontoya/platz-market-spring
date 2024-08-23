package com.platzi.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platzi.domain.Product;
import com.platzi.repositories.ProductRepository;
import com.platzi.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product getProduct(int productId) {
        return productRepository.findById(productId).get();
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public boolean delete(int productId) {
        if (getProduct(productId) != null) {
            productRepository.deleteById(productId);
            return true;
        }
        return false;
    }
}