package com.pages.swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class CheckoutOverviewPage {

   private WebDriver driver;
   private WebDriverWait wait;

   @FindBy(partialLinkText = "inventory-item.html?id=4")
   private WebElement lnk_ItemName;

   @FindBy(xpath = "//*[starts-with(@class,'svg-inline--fa')]" )
   private WebElement btn_Cart;

   @FindBy(xpath = "//*[starts-with(@class,'cart_cancel_link')]")
   private WebElement btn_Cancel;

   @FindBy(xpath = "//*[starts-with(@class,'btn_action')]")
   private WebElement btn_Finish;


   public CheckoutOverviewPage(WebDriver driver){
      this.driver = driver;
      PageFactory.initElements(driver,this);
      wait = new WebDriverWait(driver,90);
      }

      public void clickItemName(){
      wait.until(ExpectedConditions.elementToBeClickable(lnk_ItemName)).click();
         Reporter.log("Item Name clicked");
      }

      public void clickCartBtn(){
      wait.until(ExpectedConditions.elementToBeClickable(btn_Cart)).click();
          Reporter.log("Cart Button Clicked");
      }

      public void clickCancelBtn() {
         wait.until(ExpectedConditions.elementToBeClickable(btn_Cancel)).click();
          Reporter.log("Cancel Button Clicked");
      }

      public void clickFinishBtn(){
         wait.until(ExpectedConditions.elementToBeClickable(btn_Finish)).click();
          Reporter.log("Finish Button Clicked");
   }


}