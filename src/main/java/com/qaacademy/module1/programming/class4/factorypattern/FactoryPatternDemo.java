package com.qaacademy.module1.programming.class4.factorypattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        // Chrome
        Browser browser = BrowserFactory.getBrowser(BrowserType.CHROME);
        System.out.println(browser.getDriver());
        BrowserReset browserReset = BrowserResetFactory.getBrowser(BrowserType.CHROME);
        browserReset.reset();
        Firefox firefox = new Firefox();

        // Firefox
        browser = BrowserFactory.getBrowser(BrowserType.FIREFOX);
        System.out.println(browser.getDriver());
        browserReset = BrowserResetFactory.getBrowser(BrowserType.FIREFOX);
        browserReset.reset();

        // Safari
        browser = BrowserFactory.getBrowser(BrowserType.SAFARI);
        System.out.println(browser.getDriver());

        // Edge
        browser = BrowserFactory.getBrowser(BrowserType.EDGE);
        System.out.println(browser.getDriver());
    }
}
