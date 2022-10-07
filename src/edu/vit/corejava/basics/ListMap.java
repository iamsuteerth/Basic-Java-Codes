package edu.vit.corejava.basics;

import java.util.*;
/*
 * @author Suteerth Subramaniam
 * @since 21 July 2022
 * Java program demonstrating basic list and map functionality.
 */

public class ListMap {
    public static void main(String[] args) {
        //Lists
        List<Integer> list = new ArrayList<Integer>(); //Since we are supposed to enter generic data type into the <>
        list.add(2);                                //We are using Integer instead of int
        list.add(5);
        list.add(7);
        System.out.println(list.toString());           //ToString() method is used for conversion into string data type
        list.remove(1);
        System.out.println(list.toString());

        //Maps
        Map<String,String> map = new HashMap<String,String>(); //A hashmap needs two generic parameters
        map.put("AK47", "7.62");
        map.put("M4A1", "5.56");
        System.out.println(map.get("M4A1"));
        System.out.println(map.toString());
        map.remove("M4A1");
        System.out.println(map.toString());
    }
}
