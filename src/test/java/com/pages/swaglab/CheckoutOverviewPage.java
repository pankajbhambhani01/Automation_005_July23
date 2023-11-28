package com.pages.swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {

   private WebDriver driver;

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
      }

      public void clickItemName(){
          lnk_ItemName.click();
      }

      public void clickCartBtn(){
          btn_Cart.click();
      }

      public void clickCancelBtn() {
          btn_Cancel.click();
      }

      public void clickFinishBtn(){
      btn_Finish.click();
      }


   }