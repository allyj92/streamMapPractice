package com.example.demo;

import java.util.List;

public class Order {
    private Long orderId;
    private Long memberId;
    private String createdAt;
    private List<Coffee> orderCoffees;

    public Order(Long orderId, Long memberId, String createdAt, List<Coffee> orderCoffees) {
        this.orderId = orderId;
        this.memberId = memberId;
        this.createdAt = createdAt;
        this.orderCoffees = orderCoffees;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public List<Coffee> getOrderCoffees() {
        return orderCoffees;
    }
}
