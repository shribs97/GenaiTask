package com.example.PRODservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PRODservice.entity.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
