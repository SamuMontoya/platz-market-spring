package com.platzi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platzi.domain.Product;
import com.platzi.services.impl.ProductServiceImpl;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok(productService.getAll());
    }

    @GetMapping("/{id}")
    public Optional<Product> getProduct(@PathVariable Integer id) {
        return Optional.of(productService.getProduct(id));
    }

    public Product save(Product product) {
        return productService.save(product);
    }

    public boolean delete(int id) {
        return productService.delete(id);
    }
}
