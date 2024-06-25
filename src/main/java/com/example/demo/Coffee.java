package com.example.demo;

public class Coffee {
    private Long coffeeId;
    private String korName;
    private String engName;
    private int price;
    private int quantity;

    public Coffee(Long coffeeId, String korName, String engName, int price, int quantity) {
        this.coffeeId = coffeeId;
        this.korName = korName;
        this.engName = engName;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getCoffeeId() {
        return coffeeId;
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

    public int getQuantity() {
        return quantity;
    }
}
