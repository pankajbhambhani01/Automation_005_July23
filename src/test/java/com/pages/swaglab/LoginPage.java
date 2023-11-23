package com.pages.swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {
        WebElement element = driver.findElement(By.name("user-name"));
        element.sendKeys(username);
    }

    public void setPassword(String password) {
        WebElement element = driver.findElement(By.name("password"));
        element.sendKeys(password);
        //driver.findElement(By.name("password")).sendKeys(password);
    }

    public void clickLogin() {
        WebElement element = driver.findElement (By.id("login-button"));
        element.click();
    }
}




