package com.pages.swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class InventoryPage {
    @Test
    public void inventoryPage() throws Exception{
        System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver-win64/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/inventory.html");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        List<WebElement> elementlist=driver.findElements(By.partialLinkText("Sauce"));
        System.out.println("Sauce Name Element size:" + elementlist.size());

        WebElement element=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select dropdown=new Select(element);
        if(dropdown.isMultiple()==true){
            System.out.println("Dropdown is multipal");
        }
        else{
            System.out.println("Dropdown is not multipal");
        }
//        dropdown.selectByValue("az");
//        System.out.println("Selected Value A to Z");
       List<WebElement> alldropdownoption= dropdown.getOptions();
        System.out.println("Total option in dropdown is:"+alldropdownoption.size());
        for(WebElement el:alldropdownoption){
            System.out.println(el.getText());
        }
        driver.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]")).click();
        System.out.println("Item is added into : Cart");
        driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']//*[name()='svg']")).click();
        System.out.println("Cart Item Is opened");

        driver.close();

//        driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
//        System.out.println("Selected Product Image of : Sauce Labs Bolt T-Shirt is opened");
//        driver.findElement(By.linkText("Sauce Labs Fleece Jacket")).click();
//        System.out.println("Selected Product Image of : Sauce Labs Fleece Jacket is opened");


    }}
