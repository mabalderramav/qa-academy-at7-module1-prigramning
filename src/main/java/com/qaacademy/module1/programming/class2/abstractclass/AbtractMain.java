package com.qaacademy.module1.programming.class2.abstractclass;

public class AbtractMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Aldo");
        student.setLastName("Vaca");

        System.out.println(student.getName().concat(" ").concat(student.getLastName()));
        student.eat();

        Trainner trainner = new Trainner();
        trainner.setName("OScar");
        trainner.setLastName("Vazques");

        System.out.println(trainner.getName().concat(" ").concat(trainner.getLastName()));
        trainner.eat();
    }
}
