package com.example.PRODservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PRODservice.entity.Cart;
import com.example.PRODservice.entity.User;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Optional<Cart> findByUser(User user);
}
