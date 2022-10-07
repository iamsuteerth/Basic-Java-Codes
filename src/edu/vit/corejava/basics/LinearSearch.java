/*
 * @author Suteerth Subramaniam
 * This program demonstrates simple linear search on an arrayList
 * 
 */
package edu.vit.corejava.basics;

import java.util.Scanner;
import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        int size, i, flag = 0;
        String key;
        System.out.println("Enter size of the list");

        // Please don't be itimidated by this try block, the code will work just fine without it
        // This is called try with resources, it is used to make sure the Scanner we created is closed after it's work is
        // done, therefore it is there in the code so VSC doesn't keep bothering me

        try (Scanner sc = new Scanner(System.in);) {
            size = sc.nextInt();
            sc.nextLine();
            System.out.println("Auto Conversion into lowercase");
            for (i = 0; i < size; i++) {
                System.out.println("Enter element " + (i + 1));
                list.add(sc.nextLine().toLowerCase().toString()); // To maintain uniformity, we will stick to lowercase
                                                                  // only for this program
            }
            System.out.println("\nEnterered List");
            for (i = 0; i < (int) list.size(); i++) {
                System.out.println("Element " + (i + 1) + " " + list.get(i)); // i+1 corresponds to position, not index
            }
            System.out.println("Enter element you want to search for ");
            key = sc.nextLine().toLowerCase();
        }
        
        for (i = 0; i < (int) list.size(); i++) {
            if (key.equals(list.get(i))) // We are using the equals method to compare strings
            {
                System.out.println("Match at position " + (i + 1) + " Element " + key);
                flag++;
            } else {
                continue;
            }
        }

        if (flag == 0) // The flag is initialized zero and if there are matches, it is increased
        { // However, if no match is found, then the flag remains zero, and the statement
          // below gets executed
            System.out.println("No Match found");
        }
    }
}
