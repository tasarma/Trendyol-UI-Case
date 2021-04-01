package com.trendyol.SeleniumTest;
import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddBasketTest extends BaseTest{

    @Test
    public void search(){
        HomePage homePage = new HomePage(webDriver);
        ProductListPage productListPage = homePage.goToTvAndImageAndSound();
        productListPage.goToProduct();
        productListPage.addToBasket();
        String title1 = productListPage.getProductTitle();
        String title2 = productListPage.getTitleInBasket();
        assertEquals(title1,title2);
    }
}
