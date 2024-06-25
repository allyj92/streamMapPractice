package com.example.demo.map;

import java.util.HashMap;
import java.util.Map;

public class wordCount {
    public static void main(String[] args) {
        String input = "hello world java hello java world";

        String[] words = input.split(" ");

        Map<String,Integer> wordCountMap = new HashMap<>();

        for(String word : words){
            wordCountMap.put(word,wordCountMap.getOrDefault(word,0)+1);

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        }
    }
}
