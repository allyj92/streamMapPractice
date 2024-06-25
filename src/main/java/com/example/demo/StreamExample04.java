package com.example.demo;

import java.util.List;
import java.util.stream.Stream;

public class StreamExample04 {
    public static void main(String[] args) {

//        salesOfBakeryA, salesOfBakeryB, salesOfBakeryC 리스트에 각각 A, B, C 베이커리의 월별 매출 데이터를 넣습니다.
        List<Integer> salesOfBakeryA = List.of(
                5000000, 5000000, 4500000, 5000000, 3000000, 4000000, 5000000, 5500000,
                3500000, 6000000, 4500000, 4500000
        );

        List<Integer> salesOfBakeryB = List.of(
                3000000, 3500000, 3300000, 2600000, 3000000, 4000000, 5500000, 3700000,
                5300000, 4400000, 3500000, 3000000
        );

        List<Integer> salesOfBakeryC = List.of(
                6000000, 5500000, 4800000, 6700000, 7000000, 5500000, 3500000, 7200000,
                5300000, 6200000, 7000000, 8000000
        );

        // 각 리스트의 합을 stream으로 구함
        long totalSalesOfBakeryA = salesOfBakeryA.stream()
                .mapToInt(Integer::intValue)
                .sum();
        long totalSalesOfBakeryB = salesOfBakeryB.stream()
                .mapToInt(Integer::intValue)
                .sum();
        long totalSalesOfBakeryC = salesOfBakeryC.stream()
                .mapToInt(Integer::intValue)
                .sum();
        // 각 합계를 더해서 출력
        System.out.println(totalSalesOfBakeryA+totalSalesOfBakeryB+totalSalesOfBakeryC);

        // 단 한번의 스트림, 람다식으로 모든 리스트의 요소의 합계를 구하는 코드
        long totalSales = Stream.of(salesOfBakeryA,salesOfBakeryB,salesOfBakeryC)
                .flatMap(List::stream)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(totalSales);
    }
}
