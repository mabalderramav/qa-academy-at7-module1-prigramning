package com.qaacademy.module1.programming.class2.collections;

import java.util.HashMap;

public class HashMapCollection {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Bolivia" , "Sucre");
        capitalCities.put("Bolivia1" , "Sucre");

        System.out.println(capitalCities);
    }
}
