package com.pages.swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {

    private WebDriver driver;
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

    public CheckOutPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterFirstName(String firstname){
        txt_FirstName.sendKeys(firstname);
    }

    public void enterLastName(String lastname){  txt_LastName.sendKeys(lastname); }

    public void enterZipCode(String zipcode){  txt_ZipCode.sendKeys(zipcode); }

    public void clickCancel(){
        btn_Cancel.click();
    }

    public void clickContinue(){
        btn_Continue.click();
    }

    public void clickMenu(){ btn_Continue.click(); }

    public void clickCheckOutbtn(){ btn_CheckOutbtn.click(); }
    }

    
        //*[contains(@class,'cart_button')]
        //*[contains(@class,'btn_secondary')]
        //driver.findElement(By.xpath("//*[@id='first-name' or @placeholder='First Name']")).click();
        //driver.findElement(By.xpath("//*[@id='last-name' or @placeholder='Last Name']")).click();
        //*[@id='postal-code' or @placeholder='Zip/Postal Code']
       //*[contains(@class,'btn_secondary')]
