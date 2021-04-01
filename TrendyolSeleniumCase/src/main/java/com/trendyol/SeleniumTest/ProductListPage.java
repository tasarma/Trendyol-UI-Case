package com.trendyol.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductListPage extends BaseMethods{

    By chosenProductBy = By.cssSelector("[title='AN-MR700 Orjinal Sihirli Kumanda']");
    By addBasketBy = By.className("add-to-bs");
    By productTitle = By.className("pr-new-br");
    By accountBasketBy = By.className("account-basket");
    By titleInBasket = By.className("pb-item");

    public ProductListPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void goToProduct(){
        scrollOnPageByElement(chosenProductBy);
        clickOnElement(chosenProductBy);
    }

    public void addToBasket(){
        clickOnElement(addBasketBy);
    }

    public String getProductTitle(){
        String title = webDriver.findElement(productTitle).getText();
        return title;
    }

    public String getTitleInBasket(){
        clickOnElement(accountBasketBy);
        String title = webDriver.findElement(titleInBasket).getAttribute("title");
        return title;
    }
}
