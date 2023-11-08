package com.collections;

public class Employee {

    private String name;
    private int age;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(){
        System.out.println("Please Provide Employee Information");
    }

    public void printEmployee(){
        System.out.println("The employee Information is " + this.name + " his age is " + this.age + " and salary is " + this.salary);
    }
}
