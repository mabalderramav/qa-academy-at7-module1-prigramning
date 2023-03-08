package com.qaacademy.module1.programming.class2.abstractclass;

public abstract class Persona {
    private String name;
    private String lastName;

    public Persona() {
        this.name = "";
        this.lastName = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void walk() {
        System.out.println("Camino hacia qa-academy");
    }

    public abstract void eat();
}
