package com.example.demo.domain;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class TOrderDto {
    private Long orderId;

    private String orderNo;

    private String createName;

    private BigDecimal price;

    private Long userId;

    private Long itemId;

    private String itemName;
}
