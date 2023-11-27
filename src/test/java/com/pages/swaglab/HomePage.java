package com.pages.swaglab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage {

    private WebDriver driver;

    private By sortNameAtoZ = By.xpath("//option[text()='Name (A to Z)']");
    private By sortNameZtoA = By.xpath("//option[text()='Name (Z to A)']");
    private By sortPriceLowHigh = By.xpath("//option[text()='Price (low to high)']");
    private By sortPriceHighLow = By.xpath("//option[text()='Price (high to low)']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonToCart(String product){
        WebElement element = driver.findElement(By.xpath("//*[contains(@class,'inventory_item_name') and text() = '" + product + "']//ancestor::div[@class='inventory_item']//button"));
        element.click();
    }

    public void validateButton(String product, String button){
        WebElement element = driver.findElement(By.xpath("//*[contains(@class,'inventory_item_name') and text() = '" + product + "']//ancestor::div[@class='inventory_item']//button"));
        String expectedButtonText = element.getText().toLowerCase();
        Assert.assertEquals(expectedButtonText, button);
    }

    public void validatePrice(String product, String price){
        WebElement element = driver.findElement(By.xpath("//*[contains(@class,'inventory_item_name') and text() = '" + product + "']//ancestor::div[@class='inventory_item']//div[@class='inventory_item_price']"));
        String actualPrice = element.getText();
        Assert.assertEquals(actualPrice, price);
    }

    public void validateDetails(String product, String description){
        WebElement element = driver.findElement(By.xpath("//*[contains(@class,'inventory_item_name') and text() = '" + product + "']//ancestor::div[@class='inventory_item']//div[@class='inventory_item_desc'"));
        String actualDescription = element.getText();
        Assert.assertEquals(actualDescription, description);
    }

}




