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
        String browser = System.getProperty("browser");
        br.launchBrowser(browser);
        br.navigateUrl(Constant.url);
        br.maximize();
    }

    @Test(groups = {"smoke"})
    public void testCase001() {
        Properties td = Constant.td;
        Util.wait(5000);
        LoginPage loginPage = new LoginPage(br.getDriver());
        loginPage.enterUsername(td.getProperty("username"));
        loginPage.enterPassword(td.getProperty("password"));
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
        Properties td = Constant.td;
        LoginPage loginPage = new LoginPage(br.getDriver());
        loginPage.validateSwagLabsLogo();
        loginPage.enterUsername(td.getProperty("username"));
        loginPage.enterPassword(td.getProperty("password"));
        loginPage.clickLogin();
    }

    @AfterMethod
    public void afterMethod(){
        Util.takeScreenShot(br.getDriver(), "testCase001");
        br.closeBrowser();
    }
}

