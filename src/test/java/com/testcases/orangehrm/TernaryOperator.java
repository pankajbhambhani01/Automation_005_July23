package com.testcases.orangehrm;

public class TernaryOperator {
    public static void main(String[] args) {
        int age = 10;
        boolean isVoter;

        if(age > 17){
            isVoter = true;
        }else{
            isVoter = false;
        }

        isVoter = age > 17 ? true : false;
        // ? : known as turnary operator


        // 0.1 - 1.0
        System.out.println(Math.random() * 10000);
    }
}
