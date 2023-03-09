package com.qaacademy.module1.programming.class2.stringclass;

import com.qaacademy.module1.programming.class2.inheritance.Vehicle;

public class StringClass {
    public static void main(String[] args) {
        String name = "Bruno";
        String lastName = "Barrios";

        // Concat String
        System.out.println(name + " " + lastName);

        String fullName = name.concat(" ").concat(lastName);
        System.out.println(fullName);

        // Compare String
        String fullName2 = fullName;
        System.out.println(fullName.equals(name + " " + lastName));
        System.out.println(fullName == name + " " + lastName);
        System.out.println(fullName == fullName2);

        // Find text on string
        System.out.println(fullName.indexOf("no")); // 3
        System.out.println(fullName.indexOf("rios")); // 9

        System.out.println(fullName.replace("no","NO"));

        // Start and End with
        System.out.println(fullName.startsWith("Br")); // true
        System.out.println(fullName.startsWith("B")); // true
        System.out.println(fullName.startsWith("b")); // false
        System.out.println(fullName.startsWith("BR")); // false

        System.out.println(fullName.endsWith("rios")); // true
        System.out.println(fullName.endsWith("Rios")); // false

        // Default Modifiers
//        Vehicle vehicle = new Vehicle();
    }
}
