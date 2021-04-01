package com.trendyol.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    By fancyBoxBy = By.className("fancybox-close");


    WebDriver webDriver;

    @BeforeMethod
    public void startUp(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        String projectPath = System.setProperty("user.dir","user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/main/resources/chromedriver.exe");
        webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        webDriver.get("https://www.trendyol.com");
        webDriver.findElement(fancyBoxBy).click();

    }




    @AfterMethod
    public void quit() throws InterruptedException {
        Thread.sleep(5);
        webDriver.quit();
    }
}
