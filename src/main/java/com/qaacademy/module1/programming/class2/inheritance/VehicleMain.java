package com.qaacademy.module1.programming.class2.inheritance;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        FordVehicle fordVehicle = new FordVehicle();
        System.out.println(fordVehicle.getBrand());
        fordVehicle.honk();
        System.out.println(fordVehicle.getModelName());
    }
}
