package com.qaacademy.module1.programming.class3.interfaces;

public class Dog implements Pet, Wild {

    @Override
    public void play() {
        System.out.println("Playing ...");
    }

    @Override
    public void hunt() {
        System.out.println("Hunting...");
    }
}
