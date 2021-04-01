package com.trendyol.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseMethods {

    WebDriver webDriver;
    Actions actions;

    public BaseMethods(WebDriver webDriver) {

        this.webDriver = webDriver;
        this.actions = new Actions(this.webDriver);
    }

    public void actionToElement(By hover, By click){
        WebElement hoverOverFirstElement = webDriver.findElement(hover);
        actions.moveToElement(hoverOverFirstElement).perform();
        WebElement hoverOverSecondElement = webDriver.findElement(click);
        hoverOverSecondElement.click();

    }

    public void moveToElement(By hover){
        WebElement hoverOverFirstElement = webDriver.findElement(hover);
        actions.moveToElement(hoverOverFirstElement).perform();
    }

    public void clickOnElement(By click){
        WebDriverWait wait = new WebDriverWait(webDriver,1);
        wait.until(ExpectedConditions.elementToBeClickable(click)).click();
    }

    public void scrollOnPageByElement(By element){
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        WebElement webElement = webDriver.findElement(element);
        js.executeScript("arguments[0].scrollIntoView();",webElement);
    }

    public void scrollOnPage(){
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,1000)");
    }

}
