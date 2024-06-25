package com.example.demo;

import java.util.stream.LongStream;

public class StreamExample03 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        long sumNumber = LongStream.rangeClosed(1,40000000000L)
                .parallel()
                .sum();

        long end = System.currentTimeMillis();
        System.out.println(sumNumber);
        System.out.println("작업 소요 시간은 : " + (end -startTime));
    }
}
