package com.platzi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.platzi.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {}
