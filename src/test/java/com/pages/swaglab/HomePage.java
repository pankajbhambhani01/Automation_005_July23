package com.pages.swaglab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private By sortNameAtoZ = By.xpath("//option[text()='Name (A to Z)']");
    private By sortNameZtoA = By.xpath("//option[text()='Name (Z to A)']");
    private By sortPriceLowHigh = By.xpath("//option[text()='Price (low to high)']");
    private By sortPriceHighLow = By.xpath("//option[text()='Price (high to low)']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openHomepage(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void sortProductsAtoZ() {
        driver.findElement(sortNameAtoZ).click();
    }

    public void sortProductsZtoA() {
        driver.findElement(sortNameZtoA).click();
    }

    public void sortProductsPriceLowHigh() {
        driver.findElement(sortPriceLowHigh).click();
    }

    public void sortProductsPriceHighLow() {
        driver.findElement(sortPriceHighLow).click();
    }
}




