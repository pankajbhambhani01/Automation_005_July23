package com.pages.swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

    private WebDriver driver;

    @FindBy(xpath = "//option[text()='Name (A to Z)']")
    private WebElement sortNameAtoZ;

    @FindBy(xpath = "//option[text()='Name (Z to A)']")
    private WebElement sortNameZtoA;

    @FindBy(xpath = "//option[text()='Price (low to high)']")
    private WebElement sortPriceLowHigh;

    @FindBy(xpath = "//option[text()='Price (high to low)']")
    private WebElement sortPriceHighLow;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickButtonToCart(String product) {
        WebElement element = driver.findElement(By.xpath("//*[contains(@class,'inventory_item_name') and text() = '" + product + "']//ancestor::div[@class='inventory_item']//button"));
        element.click();
    }

    public void validateButton(String product, String button) {
        WebElement element = driver.findElement(By.xpath("//*[contains(@class,'inventory_item_name') and text() = '" + product + "']//ancestor::div[@class='inventory_item']//button"));
        String expectedButtonText = element.getText();
        Assert.assertEquals(expectedButtonText, button);
    }

    public void validatePrice(String product, String price) {
        WebElement element = driver.findElement(By.xpath("//*[contains(@class,'inventory_item_name') and text() = '" + product + "']//ancestor::div[@class='inventory_item']//div[@class='inventory_item_price']"));
        String actualPrice = element.getText();
        Assert.assertEquals(actualPrice, price);
    }

    public void validateDetails(String product, String description) {
        WebElement element = driver.findElement(By.xpath("//*[contains(@class,'inventory_item_name') and text() = '" + product + "']//ancestor::div[@class='inventory_item']//div[@class='inventory_item_desc']"));
        String actualDescription = element.getText();
        Assert.assertEquals(actualDescription, description);
    }



}




