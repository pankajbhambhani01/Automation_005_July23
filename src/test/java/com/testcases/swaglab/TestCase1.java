package com.testcases.swaglab;

import com.pages.swaglab.HomePage;
import com.pages.swaglab.LoginPage;
import com.utility.Browser;
import com.utility.Constant;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCase1 {

    @Test
    public void testCase001() throws Exception {
        Browser br = new Browser();
        br.launchBrowser("chrome");
        br.navigateUrl(Constant.url);
        Thread.sleep(5000);
        LoginPage loginPage = new LoginPage(br.getDriver());
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLogin();
        Thread.sleep(5000);
        HomePage homePage = new HomePage(br.getDriver());
        homePage.validatePrice("Sauce Labs Bike Light", "$9.99");
        homePage.validateButton("Sauce Labs Bike Light", "add to cart");
        homePage.validateDetails("Sauce Labs Bike Light", "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.");
        homePage.clickButtonToCart("Sauce Labs Bike Light");
        homePage.validateButton("Sauce Labs Bike Light", "REMOVE");

    }
}

