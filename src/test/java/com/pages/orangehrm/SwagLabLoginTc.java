package com.pages.orangehrm;

import com.pages.swaglab.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwagLabLoginTc {
    @Test
    public void SwagLabLoginTc () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        Thread.sleep(4000);

        SwagLabLoginPage sl = new SwagLabLoginPage(driver);
        sl.setUsername("performance_glitch_user");
        sl.setPassword("secret_sauce");
        sl.clickLogin();



    }
}
