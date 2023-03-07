package com.qaacademy.module1.programming.class1.flowControls;

public class FlowControl {
    public static void main(String[] args) {
        // If statement
//        int x = 3;
//        int y = 4;
//
//        if (x > y) {
//            System.out.println("si x es mayor que y");
//        } else if (x == y) {
//            System.out.println("x es menor o igual que y");
//        } else {
//            System.out.println("x no es mayor que y, tampoco x es igual que y");
//        }

        // For Loop
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i + 1);
//        }

        // For-Each Loop
//        String[] cars = {"Volvo", "BMW", "Ford", "Toyota"};
//        for (String word : cars) {
//            System.out.println(word);
//        }

        String[] cars = {"Volvo", "BMW", "Ford", "Toyota"};
        for (String word : cars) {
            if (word.contains("z")) {
                System.out.println(word);
            } else if (word.contains("w")) {
                System.out.println(word);
            } else if (word.contains("o")) {
                System.out.println(word);
            }
        }

        // While Loop
//        int i = 0;
//        while (i < 5) {
//            System.out.println(i + 1);
//            i++;
//        }
    }
}
