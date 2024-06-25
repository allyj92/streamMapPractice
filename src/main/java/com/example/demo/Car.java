package com.example.demo;

public class Car {
    private CarBrand carBrand;
    private CarType carType;
    private String name;
    private int price;
    private boolean isNew;

    public Car(CarBrand carBrand, CarType carType, String name, int price, boolean isNew) {
        this.carBrand = carBrand;
        this.carType = carType;
        this.name = name;
        this.price = price;
        this.isNew = isNew;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public String getName() {
        return name;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getPrice() {
        return price;
    }

    public boolean isNew() {
        return isNew;
    }

    public enum CarBrand{
        BMW,
        Benz,
        Volkswagen,
        Ford,
        Jeep
    }
    public enum CarType{
        SEDAN,
        SUV,
        PICKUPTRUCK
    }
}


