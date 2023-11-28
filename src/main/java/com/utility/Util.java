package com.utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Util {

    public static void wait(int timeinsec){
       try {
           Thread.sleep(timeinsec);
       }catch (Exception e){
           System.out.println("the exception while wait " + e.toString());
       }
    }

    public static Properties readProperties(String fileName){
        Properties pr = new Properties();
        try {
            File f = new File("src/test/resources/TestData/" + fileName + ".properties");
            FileInputStream fileInputStream = new FileInputStream(f);
            pr.load(fileInputStream);
        }catch(Exception e){
            System.out.println("the exception while reading " + e.toString());
        }
        return pr;
    }

    public static void takeScreenShot(WebDriver driver, String fileName){
        try {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("src/test/resources/ScreenShot/" + fileName + ".png"));
        }catch(Exception e){
            System.out.println("the exception while taking screenshot " + e.toString());
        }
    }
}
