package com.qaacademy.module1.programming.class3.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal pig = new Pig();
        Animal cat = new Cat();

        List<Animal> animalList = new ArrayList<>();

        animalList.add(animal);
        animalList.add(pig);
        animalList.add(cat);

        animalList.forEach(animal1 -> animal1.sound());
    }
}
