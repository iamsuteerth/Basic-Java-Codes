/*
 * This program demonstrates simple linear search on an arrayList
 * 
 * @author Suteerth Subramaniam
 */
package edu.vit.corejava.basics;

import java.util.Scanner;
import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        int size, i,flag=0;
        String key;
        System.out.println("Enter size of the list");
        size = sc.nextInt();
        sc.nextLine();
        System.out.println("Auto Conversion into lowercase");
        for (i = 0; i < size; i++) 
        {
            System.out.println("Enter element " + (i + 1));
            list.add(sc.nextLine().toLowerCase().toString());
        }
        System.out.println("\nEnterered List");
        for (i = 0; i < (int) list.size(); i++) 
        {
            System.out.println("Element "+(i+1)+" "+list.get(i));
        }
        System.out.println("Enter element you want to search for ");
        key = sc.nextLine().toLowerCase();
        for (i = 0; i < (int) list.size(); i++) 
        {
            if(key.equals(list.get(i)))
            {
                System.out.println("Match at position "+(i+1)+" Element "+key);
                flag++;
            }
            else
            {   
                continue;
            }
        }
        if(flag==0) //The flag is initialized zero and if there are matches, it is increased
        {           //However, if no match is found, then the flag remains zero, and the statement below gets executed
            System.out.println("No Match found");
        }  
        sc.close();
    }
}
