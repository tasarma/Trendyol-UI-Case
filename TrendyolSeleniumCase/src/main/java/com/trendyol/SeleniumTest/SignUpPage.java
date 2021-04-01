package com.trendyol.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SignUpPage extends BaseMethods{

    By emailBy = By.id("register-email");
    By passwordBy = By.id("register-password-input");
    By submitBy = By.className("submit");
    By closeNotificationBy = By.className("modal-close");
    By accountButtonBy = By.className("account-user");
    By signupButtonBy = By.className("signup-button");

    public SignUpPage(WebDriver webDriver){
        super(webDriver);
    }

    public HomePage signUp(String email, String password){
        moveToElement(accountButtonBy);
        clickOnElement(signupButtonBy);
        webDriver.findElement(emailBy).sendKeys(email);
        webDriver.findElement(passwordBy).sendKeys(password + Keys.ENTER);
        webDriver.findElement(closeNotificationBy).click();
        return new HomePage(webDriver);
    }
}
