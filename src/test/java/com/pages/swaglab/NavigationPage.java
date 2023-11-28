package com.pages.swaglab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationPage {
    WebDriver driver;
    NavigationPage(WebDriver d){
        driver=d;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//button[normalize-space()='Open Menu']")
    WebElement menubutton;
    @FindBy(id="inventory_sidebar_link")
    WebElement Allitemsbutton;
    @FindBy(xpath="//a[@id='about_sidebar_link']")
    WebElement Aboutbutton;
    @FindBy(xpath="//a[@id='logout_sidebar_link']")
    WebElement Logoutbutton;
    @FindBy(xpath="//a[@id='reset_sidebar_link']")
    WebElement ResetAppStatebutton;

    public void clickonmenubutton(){ menubutton.click(); }
    public void clickonAllittem(){Allitemsbutton.click();}
    public void clickonAboutbutton(){ Aboutbutton.click();}
    public void clickonlogoutbutton(){Logoutbutton.click();}
    public void clickonReset(){ ResetAppStatebutton.click();}


}
