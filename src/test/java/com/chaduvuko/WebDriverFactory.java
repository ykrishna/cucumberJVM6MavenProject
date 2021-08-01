package com.chaduvuko;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static WebDriver createWebDriver() {
        String webDriver = System.getProperty("browser", "chrome");
        switch(webDriver) {
            case "firefox":
                return new FirefoxDriver();
            case "chrome":
                return new ChromeDriver();
            default:
                throw new RuntimeException("Unsupported webDriver: " + webDriver);
        }
    }
}
