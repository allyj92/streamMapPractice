package com.example.demo;

import java.util.stream.IntStream;

public class StreamExample01 {
    public static void main(String[] args) {
        IntStream.rangeClosed(2,9)
                .filter(num -> num % 2 !=0)
                .forEach(firstNum -> IntStream.rangeClosed(1,9)
                        .forEach(lastNum ->
                                System.out.println(firstNum + " * " +lastNum + " = " + firstNum * lastNum))

                );

        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        for(int num1 : arr){
            if (num1%2==0 || num1 ==1) continue;
            for(int num2:arr){
                System.out.println(num1 + "  * " + num2 + " = " + (num1*num2));
            }

        }
    }
}
