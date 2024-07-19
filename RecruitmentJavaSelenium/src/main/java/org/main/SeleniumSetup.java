package org.main;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumSetup {


    @BeforeAll
    public static WebDriver createWebdriver(){
        WebDriver driver;
        System.setProperty("webdriver.firefox.driver", "./src/test/resources/BrowserDrivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        return driver;
    }
}
