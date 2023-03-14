package com.qaacademy.module1.programming.class4.factorypattern;

public final class BrowserResetFactory {
    private BrowserResetFactory(){}


    public static BrowserReset getBrowser(BrowserType browserType) {
        return switch (browserType){
            case FIREFOX -> new Firefox();
            case CHROME -> new Chrome();
            default -> throw new IllegalStateException("Unexpected value: ".concat(browserType.toString()));
        };
    }
}
