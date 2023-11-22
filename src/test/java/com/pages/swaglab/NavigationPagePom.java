package com.pages.swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationPagePom {
    WebDriver driver;

   public NavigationPagePom(WebDriver d){
        driver=d;
    }
    By menubutton= By.xpath("//button[normalize-space()='Open Menu']");
    By Allitemsbutton=By.id("inventory_sidebar_link");
    By Aboutbutton=By.xpath("//a[@id='about_sidebar_link']");
    By Logoutbutton=By.xpath("//a[@id='logout_sidebar_link']");
    By ResetAppStatebutton=By.xpath("//a[@id='reset_sidebar_link']");

    public void clickonmenubutton(){ driver.findElement(menubutton).click();
    }
    public void clickonAllittem(){driver.findElement(Allitemsbutton).click();}
    public void clickonAboutbutton(){ driver.findElement(Aboutbutton).click();}
      public void clickonlogoutbutton(){driver.findElement(Logoutbutton).click();}
    public void clickonReset(){ driver.findElement(ResetAppStatebutton).click();}

}
