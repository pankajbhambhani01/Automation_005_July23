package com.pages.swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
    // public static void main(String[]args) throws Exception {
    //    System.setProperty("webdriver.chrome.driver", "C:/Users/JMS/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
    //    WebDriver driver = new ChromeDriver();
    //   driver.get("https://www.saucedemo.com/v1/");
    // driver.manage().window().maximize();
    //   Thread.sleep(3000);

    private WebDriver driver;
    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterFirstname(String FirstName) {
        WebElement element = driver.findElement(By.xpath("//*[@id='first-name' or @placeholder='First Name']"));
        element.sendKeys(FirstName);
    }
    public void enterLastname(String LastName) {
        WebElement element = driver.findElement(By.xpath("//*[@id='last-name' or @placeholder='Last Name']"));
        element.sendKeys(LastName);
    }
    public void enterpostalcode(String ZipCode) {
        WebElement element = driver.findElement(By.xpath("//*[@id='postal-code' or @placeholder='Zip/Postal Code']"));
        element.sendKeys(ZipCode);
    }
    public void clickCancel(){
        WebElement element = driver.findElement(By.xpath("//*[contains(@class,'btn_secondary')]"));
        element.click();
    }
    public void clickContinue(){
        WebElement element = driver.findElement(By.xpath("//*[contains(@class,'cart_button')]"));
        element.click();
    }
    public void RobotImg() {
        WebElement element = driver.findElement(By.xpath("//*[contains(@class,'footer_robot')]"));
        element.click();
    }
}



        //*[contains(@class,'footer_robot')]
        //*[contains(@class,'cart_button')]
        //*[contains(@class,'btn_secondary')]
        //driver.findElement(By.xpath("//*[@id='first-name' or @placeholder='First Name']")).click();
        //driver.findElement(By.xpath("//*[@id='last-name' or @placeholder='Last Name']")).click();
        //*[@id='postal-code' or @placeholder='Zip/Postal Code']
       //*[contains(@class,'btn_secondary')]
