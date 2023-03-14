package com.qaacademy.module1.programming.class5;

import com.qaacademy.module1.programming.class4.factorypattern.Browser;
import com.qaacademy.module1.programming.class4.factorypattern.BrowserFactory;
import com.qaacademy.module1.programming.class4.factorypattern.BrowserType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Browser Test")
public final class BrowserTest {

    @BeforeEach
    public void setup() {
        System.out.println("Setting up Test");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Tearing down test");
    }

    @Test
    @DisplayName("Test Chrome Browser")
    public void testChromeBrowser() {
        Browser browser = BrowserFactory.getBrowser(BrowserType.CHROME);
        System.out.println(browser.getDriver());
        Assertions.assertEquals("Chrome Driver", browser.getDriver(), "Browser is not Chrome");
    }

    @Test
    @DisplayName("Test Firefox Browser")
    public void testFirefoxBrowser() {
        Browser browser = BrowserFactory.getBrowser(BrowserType.FIREFOX);
        System.out.println(browser.getDriver());
        Assertions.assertEquals("Firefox Driver", browser.getDriver(), "Browser is not Firefox");
    }

    @Test
    @DisplayName("Test Safari Browser")
    public void testSafariBrowser() {
        Browser browser = BrowserFactory.getBrowser(BrowserType.SAFARI);
        System.out.println(browser.getDriver());
        Assertions.assertEquals("Safari Driver", browser.getDriver(), "Browser is not Safari");
    }

    @Test
    @DisplayName("Test Edge Browser")
    public void testEdgeBrowser() {
        Browser browser = BrowserFactory.getBrowser(BrowserType.EDGE);
        System.out.println(browser.getDriver());
        Assertions.assertEquals("Edge Driver", browser.getDriver(), "Browser is not Edge");
    }
}
