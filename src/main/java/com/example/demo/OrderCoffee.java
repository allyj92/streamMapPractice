package com.example.demo;

public class OrderCoffee {
    private long orderId; // 주문 ID
    private long memberId; // 회원 ID
    private String createdAt; // 주문 일시
    private long coffeeId; // 커피 ID
    private int quantity; // 주문 수량
    private String korName; // 커피명(한글)
    private String engName; // 커피명(영문)
    private int price; // 커피 한 잔 가격
    private String coffeeCode; // 커피 코드

    public OrderCoffee(long orderId, long memberId, String createdAt, long coffeeId, int quantity, String korName, String engName, int price, String coffeeCode) {
        this.orderId = orderId;
        this.memberId = memberId;
        this.createdAt = createdAt;
        this.coffeeId = coffeeId;
        this.quantity = quantity;
        this.korName = korName;
        this.engName = engName;
        this.price = price;
        this.coffeeCode = coffeeCode;
    }

    public long getOrderId() {
        return orderId;
    }

    public long getMemberId() {
        return memberId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public long getCoffeeId() {
        return coffeeId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getKorName() {
        return korName;
    }

    public String getEngName() {
        return engName;
    }

    public int getPrice() {
        return price;
    }

    public String getCoffeeCode() {
        return coffeeCode;
    }
}
