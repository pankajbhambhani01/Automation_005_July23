package com.testcases.swaglab;

import com.pages.swaglab.HomePage;
import com.pages.swaglab.LoginPage;
import com.utility.Browser;
import com.utility.Constant;
import com.utility.Util;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class TestCase1 {
    Browser br = null;

    @BeforeMethod
    public void beforeMethod(){
        br = new Browser();
        br.launchBrowser("chrome");
        br.navigateUrl(Constant.url);
        br.maximize();
    }

    @Test
    public void testCase001() {
        Properties td = Util.readProperties("testCase001");
        Util.wait(5000);
        LoginPage loginPage = new LoginPage(br.getDriver());
        loginPage.setUsername(td.getProperty("username"));
        loginPage.setPassword(td.getProperty("password"));
        loginPage.clickLogin();
        Util.wait(5000);
        HomePage homePage = new HomePage(br.getDriver());
        homePage.validatePrice(td.getProperty("productName"), td.getProperty("productPrice"));
        homePage.validateButton(td.getProperty("productName"), "ADD TO CART");
        homePage.validateDetails(td.getProperty("productName"), td.getProperty("productDescription"));
        homePage.clickButtonToCart(td.getProperty("productName"));
        homePage.validateButton(td.getProperty("productName"), "REMOVE");
    }

    @Test
    public void testcase002(){
        //
        //
        //
    }

    @AfterMethod
    public void afterMethod(){
        Util.takeScreenShot(br.getDriver(), "testCase001");
        br.closeBrowser();
    }
}

