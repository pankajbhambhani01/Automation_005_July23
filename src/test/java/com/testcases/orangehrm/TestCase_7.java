package com.testcases.orangehrm;

import com.pages.orangehrm.HomePage;
import com.utility.Browser;
import com.utility.Constant_1;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestCase_7 {

    public static void main(String[] args) throws Exception {
        Browser br = new Browser();
        br.launchBrowser("chrome");
        br.navigateUrl("http://only-testing-blog.blogspot.com/2014/01/textbox.html?");
        WebDriver driver = br.getDriver();
        Thread.sleep(5000);
        // enabled disabled elements
//        WebElement element1 = null;
//        element1 = driver.findElement(By.name("fname"));
//        WebElement element2 = null;
//        element2 = driver.findElement(By.cssSelector("#text2"));
//        element1.sendKeys("Pankaj");
//        System.out.println("Element 1 - First Name " + element1.isEnabled());
//        System.out.println("Element 2 - Last Name " + element2.isEnabled());
//        Thread.sleep(12000);
//        System.out.println("Post wait.. ");
//        System.out.println("Element 1 - First Name " + element1.isEnabled());
//        System.out.println("Element 2 - Last Name " + element2.isEnabled());
//        //WebDriverException: element not interactable
//        //element1.sendKeys("Pankaj");
//        element2.sendKeys("Pankaj");

        // Hidden elements
//        WebElement element3 = null;
//        element3 = driver.findElement(By.id("text4"));
//        System.out.println(element3.isDisplayed());
//        Thread.sleep(12000);
//        System.out.println(element3.isDisplayed()); // staleElementException

        // --- checkbox
        WebElement element4 = null;
        element4 = driver.findElement(By.xpath("//input[@value='Boat']"));
        element4.click();

        WebElement element5 = null;
        element5 = driver.findElement(By.xpath("//input[@value='Bike']"));
        System.out.println(element5.isSelected());
        Thread.sleep(12000);
        System.out.println(element5.isSelected());

        // radio button
        WebElement element6 = null;
        element6 = driver.findElement(By.xpath("//input[@value='male']"));
        element6.click();

        // dropdown - list - select

        WebElement element7 = null;
        element7 = driver.findElement(By.cssSelector("#Carlist"));
        Select s = new Select(element7);
        s.selectByVisibleText("Audi");
        System.out.println("The selected option is " + s.getFirstSelectedOption().getText());
        Thread.sleep(3000);
        s.selectByIndex(1); // BMW
        System.out.println("The selected option is " + s.getFirstSelectedOption().getText());
        Thread.sleep(3000);
        s.selectByValue("Toyota Car");
        System.out.println("The selected option is " + s.getFirstSelectedOption().getText());
        List<WebElement> allOptions = s.getOptions();
        System.out.println("The options count is " + allOptions.size());
        System.out.println("Is list is multiselect or not " + s.isMultiple());
        for(WebElement e : allOptions){
            System.out.println("The text of option is " + e.getText());
        }

        WebElement element8 = null;
        element8 = driver.findElement(By.xpath("//button[text()='Show Me Confirmation']"));
        element8.click();
        Thread.sleep(3000);
        Alert a = driver.switchTo().alert();
        System.out.println("Message on alert " + a.getText());
        //a.accept(); -> to click OK
        a.dismiss();  // -> to click cancel
        // a.getText()  to get the text message from alert
        // a.sendKeys("Pankaj"); -> enter any text to alert
        Thread.sleep(3000);
        WebElement element9 = null;
        element9 = driver.findElement(By.cssSelector("#demo"));
        System.out.println("the user pressed " + element9.getText());
    }
}

