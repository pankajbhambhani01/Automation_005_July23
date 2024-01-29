package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Browser {
    private WebDriver driver = null;

    public WebDriver getDriver(){
        return driver;
    }

    public void launchBrowser(String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
            driver = new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("edge")){

        }else if(browserName.equalsIgnoreCase("grid")){
            String nodeUrl = System.getProperty("gridUrl");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setBrowserName("chrome");
            try {
                driver = new RemoteWebDriver(new URL(nodeUrl), capabilities);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Given browser is not present");
        }
        driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
    }

    public void navigateUrl(String url){
        this.driver.get(url);
    }

    public void maximize(){
        driver.manage().window().maximize();
    }

    public void closeBrowser(){
        driver.close(); // to close the current window
        //driver.quit(); -> to close all the windows open by webdriver
    }
}
