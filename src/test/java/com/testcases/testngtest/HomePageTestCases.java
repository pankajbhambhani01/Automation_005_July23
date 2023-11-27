package com.testcases.testngtest;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import org.testng.internal.annotations.IBeforeGroups;

public class HomePageTestCases {

    @Test(groups = {"smoke"})
    public void testCase001(){
       System.out.println("I am in Testcase 1");
    }

    @Test(groups = {"smoke", "regression"})
    public void testCase002(){
        System.out.println("I am in Testcase 2");
    }

    @Test
    public void testCase003(){
        System.out.println("I am in Testcase 3");
    }

    @BeforeGroups
    public void beforeGroup(){
        System.out.println("running before group");
    }
}

