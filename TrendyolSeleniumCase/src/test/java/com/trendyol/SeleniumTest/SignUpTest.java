package com.trendyol.SeleniumTest;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SignUpTest extends BaseTest{

    @Test
    public void signUp(){

        User user = new User();
        user.setEmail("ajj63120@cuoly.com");

        SignUpPage signUpPage = new SignUpPage(webDriver);
        HomePage homePage = signUpPage.signUp(user.getEmail(), user.getPassword());

        String accountButtonText =homePage.getAccountText();
        assertEquals(accountButtonText, "Hesabım");
    }
}
