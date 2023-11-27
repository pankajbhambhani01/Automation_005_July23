package com.pages.swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChekoutOverviewPage {

   private WebDriver driver;
   public ChekoutOverviewPage (WebDriver driver){
      this.driver = driver;
      }

      public void clickItemName(){
      WebElement element = driver.findElement(By.partialLinkText("inventory-item.html?id=4"));
      element.click();
      }


      public void clickCartBtn(){
      WebElement element = driver.findElement(By.xpath("//*[starts-with(@class,'svg-inline--fa')]"));
      element.click();
      }

      public void clickCancel() {
         WebElement element = driver.findElement(By.xpath("//*[starts-with(@class,'cart_cancel_link')]"));
         element.click();
      }

      public void clickFinish(){
      WebElement element = driver.findElement(By.xpath("//*[starts-with(@class,'btn_action')]"));
      element.click();
      }


   }