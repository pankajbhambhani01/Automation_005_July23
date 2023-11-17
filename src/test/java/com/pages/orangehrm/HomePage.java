package com.pages.orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsernameTxt(String username){
        WebElement element;
        element = driver.findElement(By.name("username"));
        element.sendKeys(username);
    }

    public void enterPasswordTxt(String password){
        driver.findElement(By.name("password")).sendKeys(password);
    }

    public void clickLoginbtn(){
        WebElement element;
        element = driver.findElement(By.tagName("button"));
        element.click();
    }

    public String getUsernameLabel(){
        WebElement element;
        element = driver.findElement(By.xpath("//*[@name='username']//parent::div//parent::div[contains(@class,'input-field')]//label"));
        return element.getText();
    }

    public String getPasswordLabel(){
        WebElement element;
        element = driver.findElement(By.xpath("//*[@name='password']//parent::div//parent::div[contains(@class,'input-field')]//label"));
        return element.getText();
    }

    public String getUsernamePlaceHolder(){
        WebElement element;
        element = this.driver.findElement(By.name("username"));
        return element.getAttribute("placeholder");
    }

    public String getPasswordPlaceHolder(){
        WebElement element;
        element = this.driver.findElement(By.name("password"));
        return element.getAttribute("placeholder");
    }

}
