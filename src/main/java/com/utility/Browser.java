package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    private WebDriver driver = null;

    public WebDriver getDriver(){
        return driver;
    }

    public void launchBrowser(String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:/Users/Pankaj Bhambhani/Downloads/driver/chromedriver.exe");
            driver = new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("edge")){

        }
    }

    public void navigateUrl(String url){
        this.driver.get(url);
    }
}
