package com.collections;

import java.util.*;

public class MyMain {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("emp1");
        e1.setAge(34);
        e1.setSalary(3434343);
        //e1.printEmployee();

        Employee e2 = new Employee();
        e2.setName("emp2");
        e2.setAge(22);
        e2.setSalary(45454);
        //e2.printEmployee();

        Employee e3 = new Employee();
        e3.setName("emp3");
        e3.setAge(56);
        e3.setSalary(12121);
        //e3.printEmployee();

        // List interface, Queue Interface, Set interface
        // list interface -> addition or deletion difficult; access the elements; duplicates allowed; order of insertion maintained
        // Array List
        List<Employee> lst = new ArrayList<Employee>();
        //ArrayList<Employee> lst2 = new ArrayList<Employee>();
        lst.add(e1);
        lst.add(e2);
        lst.add(e3);
        lst.add(e3);
        lst.add(e1);
        lst.remove(e2);
        //array -> way to dynamically store data

        for (int i = 0; i < lst.size(); i++) {
            //Employee e = lst.get(i);
            //e.printEmployee();
            lst.get(i).printEmployee();
        }

        for (Employee e : lst) {
            e.printEmployee();
        }

        // LinkedList
        List<Employee>lst1 = new LinkedList<Employee>();
        // linkedlist way to store the data
        //vector
        List<Employee>lst2 = new Vector<Employee>();
        // Stack
        //Vector<Employee>lst3 = new Stack<Employee>();
        List<Employee>lst3 = new Stack<Employee>();
        //Stack<Employee>lst3 = new Stack<Employee>();

        // Queue
        Queue<Employee> q1 = new PriorityQueue<Employee>();

        //Set -> duplicates are not allowed, order of insertion is not maintained
        // Hashing technology
        Set<String> s1 = new HashSet<String>();
        s1.add("Pankaj");
        s1.add("Pankaj");
        s1.add("ABC");
        s1.add("PQR");
        //My name is pankaj and i am a tutor and my work is to teach everyone and i want to teach

        for(String s : s1){
            System.out.println(s);
        }
        // Linkedlist + hashing technology
        Set<String> s2 = new LinkedHashSet<String>();

        // Tree
        Set<String>s3 = new TreeSet<String>();
        s3.add("Pankaj");
        s3.add("ABC");
        s3.add("PQR");
        for(String s : s3){
            System.out.println(s);
        }

        // MAP ->

    }
}
