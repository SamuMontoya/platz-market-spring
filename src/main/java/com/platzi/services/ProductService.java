package com.platzi.services;

import java.util.List;

import com.platzi.domain.Product;

public interface ProductService {
    public List<Product> getAll();
    public Product getProduct(int productId);
    public Product save(Product product);
    public boolean delete(int productId);
}
