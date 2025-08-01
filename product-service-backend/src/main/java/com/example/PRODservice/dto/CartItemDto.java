package com.example.PRODservice.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class CartItemDto {
    private Long productId;
    private int quantity;
    private BigDecimal price;
    private String productName;
}
