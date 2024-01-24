package com.testcases.testngtest;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IBeforeGroups;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Listeners(com.listners.TestListners.class)
public class HomePageTestCases {

    @Test(groups = {"smoke"})
    public void testCase001(){
       System.out.println("I am in Testcase 1");
    }

    @Test(groups = {"smoke", "regression"}, expectedExceptions = FileNotFoundException.class)
    public void testCase002()throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new File(""));
        System.out.println("I am in Testcase 2");
    }

    @Test(timeOut = 5000, invocationCount = 4)
    public void testCase003(){
        System.out.println("I am in Testcase 3");
    }

    @Test(dependsOnMethods = {"testCase003", ""})
    public void testCase004(){
        System.out.println("I am in Testcase 3");
    }

    @BeforeGroups
    public void beforeGroup(){
        System.out.println("running before group");
    }
}

