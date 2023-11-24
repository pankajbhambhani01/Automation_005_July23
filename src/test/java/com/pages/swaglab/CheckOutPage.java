package com.pages.swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {

    private WebDriver driver;
    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterFirstName(String FirstName) {
        WebElement element = driver.findElement(By.xpath("//*[@id='first-name' and @placeholder='First Name']"));
        element.sendKeys(FirstName);
    }
    public void enterLastName(String LastName) {
        WebElement element = driver.findElement(By.xpath("//*[@id='last-name' and @placeholder='Last Name']"));
        element.sendKeys(LastName);
    }
    public void enterPostalCode(String ZipCode) {
        WebElement element = driver.findElement(By.xpath("//*[@id='postal-code' and @placeholder='Zip/Postal Code']"));
        element.sendKeys(ZipCode);
    }
    public void clickCancel(){
        WebElement element = driver.findElement(By.xpath("//*[contains(@class,'btn_secondary')]"));
        element.click();
    }
    public void clickContinue(){
        WebElement element = driver.findElement(By.xpath("//*[contains(@class,'cart_button')]"));
        element.click();
    }
}


               //...
        //*[contains(@class,'footer_robot')]
        //*[contains(@class,'cart_button')]
        //*[contains(@class,'btn_secondary')]
        //driver.findElement(By.xpath("//*[@id='first-name' or @placeholder='First Name']")).click();
        //driver.findElement(By.xpath("//*[@id='last-name' or @placeholder='Last Name']")).click();
        //*[@id='postal-code' or @placeholder='Zip/Postal Code']
       //*[contains(@class,'btn_secondary')]
