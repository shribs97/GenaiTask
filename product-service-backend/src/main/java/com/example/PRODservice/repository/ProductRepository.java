package com.example.PRODservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PRODservice.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
