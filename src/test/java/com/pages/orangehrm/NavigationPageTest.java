package com.pages.orangehrm;

import com.pages.swaglab.NavigationPagePom;
import com.utility.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationPageTest {
    public static void main(String[]args) {
        Browser br=new Browser();
        System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver-win64/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        NavigationPagePom npage= new NavigationPagePom(driver);
        driver.get("https://www.saucedemo.com/v1/inventory.html");
        npage.clickonmenubutton();
        npage.clickonAllittem();
//        npage.clickonAboutbutton();
//        npage.clickonlogoutbutton();
//        npage.clickonReset();


    }
}
