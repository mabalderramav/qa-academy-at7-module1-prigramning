package com.qaacademy.module1.programming.class1.classes;

public class StudentEntrie {
    public static void main(String[] args) {
        Student student = new Student("Bruno", "Barrios", "458658652");
        System.out.println("Mi nombre completo es : " + student.myFullName());
    }
}
