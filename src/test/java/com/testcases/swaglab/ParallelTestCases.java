package com.testcases.swaglab;

import com.pages.swaglab.HomePage;
import com.pages.swaglab.LoginPage;
import com.utility.Browser;
import com.utility.Constant;
import com.utility.Util;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class ParallelTestCases {
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
        Properties td = Constant.td;
        Util.wait(5000);
        LoginPage loginPage = new LoginPage(br.getDriver());
        loginPage.enterUsername(td.getProperty("username"));
        loginPage.enterPassword(td.getProperty("password"));
        loginPage.clickLogin();
    }

    @Test
    public void testcase002(){
        Properties td = Constant.td;
        Util.wait(5000);
        LoginPage loginPage = new LoginPage(br.getDriver());
        loginPage.enterUsername(td.getProperty("username"));
        loginPage.enterPassword(td.getProperty("password"));
        loginPage.clickLogin();
    }

    @Test
    public void testcase003(){
        Properties td = Constant.td;
        Util.wait(5000);
        LoginPage loginPage = new LoginPage(br.getDriver());
        loginPage.enterUsername(td.getProperty("username"));
        loginPage.enterPassword(td.getProperty("password"));
        loginPage.clickLogin();
    }

    @Test
    public void testcase004(){
        Properties td = Constant.td;
        Util.wait(5000);
        LoginPage loginPage = new LoginPage(br.getDriver());
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

