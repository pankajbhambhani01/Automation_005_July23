package com.pages.swaglab;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    private WebDriver driver;
    @FindBy(xpath = "//*[contains(@class,'inventory_item_name')]")
    private WebElement btn_PurchaseItem;

    @FindBy(xpath = "//*[@href='./inventory.html' and @class='btn_secondary']")
    private WebElement btn_ContinueShopping;

    @FindBy(xpath = "//*[@href='./checkout-step-one.html' and @class='btn_action checkout_button']")
    private WebElement btn_CheckOut;

    @FindBy(xpath = "button[class='btn_secondary cart_button']")
    private WebElement btn_Remove;


    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickPurchaseItem() {
        btn_PurchaseItem.click();
    }

    public void clickContinueShopping() {
        btn_ContinueShopping.click();
    }

    public void clickCheckOut() {
        btn_CheckOut.click();
    }

    public void clickRemove(){
        btn_Remove.click();
    }
}
