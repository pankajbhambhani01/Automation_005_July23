package com.pages.swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class CheckOutPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//*[@id='first-name' and @placeholder='First Name']")
    private WebElement txt_FirstName;

    @FindBy(xpath = "//*[@id='last-name' and @placeholder='Last Name']")
    private WebElement txt_LastName;

    @FindBy(xpath = "//*[@id='postal-code' and @placeholder='Zip/Postal Code']")
    private WebElement txt_ZipCode;

    @FindBy(xpath = "//*[contains(@class,'btn_secondary')]")
    private WebElement btn_Cancel;

    @FindBy(xpath = "//*[contains(@class,'cart_button')]")
    private WebElement btn_Continue;

    @FindBy(xpath = "//*[starts-with(@class,'bm-burger-button')]")
    private WebElement btn_Menu;

    @FindBy(xpath = "//*[starts-with(@class,'svg-inline--fa')]")
    private WebElement btn_CheckOutbtn;

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 90);
    }

    public void enterFirstName(String firstname) {
        wait.until(ExpectedConditions.visibilityOf(txt_FirstName)).sendKeys(firstname);
        Reporter.log("Entered The First Name" + firstname);
    }

    public void enterLastName(String lastname) {
        wait.until(ExpectedConditions.visibilityOf(txt_LastName)).sendKeys(lastname);
        Reporter.log("Entered The Last Name" + lastname);
    }

    public void enterZipCode(String zipcode) {
        wait.until(ExpectedConditions.visibilityOf(txt_ZipCode)).sendKeys(zipcode);
        Reporter.log("Entered The Last Name" + zipcode);
    }

    public void clickCancel() {
        wait.until(ExpectedConditions.elementToBeClickable(btn_Cancel)).click();
        Reporter.log("Cancel button clicked");
    }

    public void clickContinue() {
        wait.until(ExpectedConditions.elementToBeClickable(btn_Continue)).click();
        Reporter.log("Continue button clicked");
    }

    public void clickMenu() {
        wait.until(ExpectedConditions.elementToBeClickable(btn_Menu)).click();
        Reporter.log("Menu button clicked");
    }

    public void clickCheckOutbtn() {
        wait.until(ExpectedConditions.elementToBeClickable(btn_CheckOutbtn)).click();
        Reporter.log("CheckOut button clicked");
    }
}
