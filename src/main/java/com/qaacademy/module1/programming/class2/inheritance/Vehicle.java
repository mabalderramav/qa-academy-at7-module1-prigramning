package com.qaacademy.module1.programming.class2.inheritance;

public class Vehicle {
    protected String brand;

    public Vehicle() {
        this.brand = "Ford";
    }

    protected String getBrand() {
        return brand;
    }

    protected void setBrand(String brand) {
        this.brand = brand;
    }

    public void honk(){
        System.out.println("tuut, tuut");
    }
}
