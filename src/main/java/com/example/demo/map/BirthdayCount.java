package com.example.demo.map;

import java.util.HashMap;
import java.util.Map;

public class BirthdayCount {
    public static void main(String[] args) {
        String[] birthdays = {"01-01","02-03","03-05","01-01","02-03","01-01"};

        // 생일별 인원 수를 저장할 맵 생성
        Map<String, Integer> birthdayCountMap = new HashMap<>();

        for(String birthday: birthdays){
            birthdayCountMap.put(birthday, birthdayCountMap.getOrDefault(birthday,0)+1);
        }

        for(Map.Entry<String,Integer> entry : birthdayCountMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
