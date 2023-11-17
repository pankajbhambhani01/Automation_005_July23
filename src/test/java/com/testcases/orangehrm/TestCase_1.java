package com.testcases.orangehrm;

import com.utility.Browser;
import com.utility.Constant_1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase_1 {

    public static void main(String[] args) throws Exception {
        //https://chromedriver.chromium.org/downloads
        Browser br = new Browser();
        br.launchBrowser("chrome");
        br.navigateUrl(Constant_1.url);
        WebDriver driver = br.getDriver();
        Thread.sleep(5000);// 5 sec wait
        WebElement element;
        element = driver.findElement(By.name("username"));
        element.sendKeys(Constant_1.username);
        element = driver.findElement(By.name("password"));
        element.sendKeys(Constant_1.password);
        element = driver.findElement(By.tagName("button"));
        //element = driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
        element.click();

       // element = driver.findElement(By.linkText("Forgot login info?"));
       // element.click();

       // element = driver.findElement(By.partialLinkText("login info?"));
       // element.click();
    }
}
// DOM - document object model (HTML model) - Hyper text mark up language source
//<tagName attributes=value > -- </tagName>
// locator identifiers
// name
// id
// linkText
// partialLinkText
//tagName
//className
//xpath
//Assignments -> naviagete to Parabank website
// enter any text in username and password field
