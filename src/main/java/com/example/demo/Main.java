package com.example.demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
//    public static void main(String[] args) {
//        Car car1 = new Car(Car.CarBrand.BMW, Car.CarType.SEDAN, "Series 3", 45000, true);
//        Car car2 = new Car(Car.CarBrand.Ford, Car.CarType.SUV, "Explorer", 35000, false);
//
//        printCarInfo(car1);
//        printCarInfo(car2);
//    }
//
//        public static void printCarInfo(Car car){
//            System.out.println("Car Brand : " + car.getCarBrand());
//            System.out.println("Car Name : " + car.getName());
//            System.out.println("Car Type : " + car.getCarType());
//            System.out.println("Car Price: $" + car.getPrice());
//            System.out.println("Is New : " + (car.isNew()? "Yes" :"No"));
//            System.out.println();
//        }

    // OrderCoffee 객체 리스트 생성
    List<OrderCoffee> orderCoffees = List.of(
            new OrderCoffee(1L, 1L, "2023-01-25T16:14:28.087671300", 1L, 1, "아메리카노", "Americano", 2500, "AMR"),
            new OrderCoffee(1L, 1L, "2023-01-25T16:14:28.087671300", 2L, 2, "바닐라 라떼", "Vanilla Latte", 4500, "VNL"),
            new OrderCoffee(2L, 2L, "2023-01-26T16:14:28.087671300", 1L, 1, "아메리카노", "Americano", 2500, "AMR"),
            new OrderCoffee(3L, 3L, "2023-01-27T16:14:28.087671500", 1L, 1, "아메리카노", "Americano", 2500, "AMR"),
            new OrderCoffee(3L, 3L, "2023-01-27T16:14:28.087671500", 3L, 2, "카라멜 라떼", "Caramel Latte", 5000, "CRL"));

   // JSON 라이브러리 설정
    Gson gson = new GsonBuilder()
           .setPrettyPrinting()
           .create();

    Map<Long,List<OrderCoffee>> groupByOrderId = orderCoffees.stream()
            .collect(Collectors.groupingBy(OrderCoffee::getOrderId));
    }

