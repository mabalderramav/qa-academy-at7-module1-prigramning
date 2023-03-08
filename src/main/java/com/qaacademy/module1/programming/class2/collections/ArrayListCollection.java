package com.qaacademy.module1.programming.class2.collections;

import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> carsList = new ArrayList<>();
        carsList.add("Volvo");
        carsList.add("Toyota");
        carsList.add("Toyota");
        carsList.add("BMW");
        carsList.add("Jac");

//        System.out.println(carsList);

        // Programacion Imperativa - Como?
//        for (String item: carsList){
//            System.out.println(item);
//        }

        for (String item : carsList) {
            if (item.equals("Toyota")) {
                System.out.println(item);
            }
        }

        // Programacion Declarito - Que?
//        carsList.forEach(item -> System.out.println(item));
        carsList.stream().filter(item -> item.equals("Toyota")).forEach(item -> System.out.println(item));
    }
}
