package com.trendyol.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BaseMethods{
    Actions actions;

    By accountButtonBy = By.className("account-user");
    By electronicFiledBy = By.cssSelector("a[href='/butik/liste/elektronik']");
    By tvAndImageAndSoundBy = By.cssSelector("img[alt='TV, Görüntü & Ses Sistemleri Aksesuarları']");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
        this.actions = new Actions(webDriver);
    }

    public String getAccountText(){
        return webDriver.findElement(accountButtonBy).getText();
    }

    public ProductListPage goToTvAndImageAndSound(){
        clickOnElement(electronicFiledBy);
        scrollOnPageByElement(tvAndImageAndSoundBy);
        clickOnElement(tvAndImageAndSoundBy);
        return new ProductListPage(webDriver);
    }

}
