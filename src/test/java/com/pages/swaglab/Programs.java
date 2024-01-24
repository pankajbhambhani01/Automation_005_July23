package com.pages.swaglab;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Programs {
    public static void main(String[] args){
        // Map -> its a Key value pair combination
        //Map -> HashMap; LinkedHashMap SortedMap -> Tree Map

        Map<Integer, String> mp = new HashMap<Integer, String>();

        mp.put(1, "India");
        mp.put(2, "USA");
        mp.put(3, "China");

        System.out.println(mp.get(1));
        System.out.println(mp.containsKey(3));
        System.out.println(mp.containsValue("USA"));


        String s = "My MName is pankaj";
        Map<Character, Integer> mp1 = new TreeMap<>();

        //String[] arr = s.split(""); // "M", "
        s = s.toLowerCase();
        s = s.replaceAll(" ", "");
        char[] c = s.toCharArray();

        for(char c1 : c){
            if(mp1.containsKey(c1)){
                int count = mp1.get(c1)+1;
                mp1.put(c1, count);
            }else{
                mp1.put(c1,1);
            }
        }

        System.out.println( mp1);


    }
}
