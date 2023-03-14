package com.qaacademy.module1.programming.class4.factorypattern;

public class Chrome implements Browser, BrowserReset {

    @Override
    public String getDriver() {
        return "Chrome Driver";
    }

    @Override
    public void reset() {
        System.out.println("Chrome reset.");
    }
}
