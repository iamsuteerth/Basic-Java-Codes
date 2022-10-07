/*
 * @author Suteerth Subramaniam
 * This program showcases looping techniques through various patterns which are described in comments.
 * 
 */

package edu.vit.corejava.basics;

import java.util.*;

public class PatternsOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an odd number");
        int size = sc.nextInt();

        while (size % 2 == 0) // Simple loop to make sure the entered number is odd only, using the modulus operator
        { 
            System.out.println("Please enter odd numbers only !");
            size = sc.nextInt();
        }
        int start = 65;
        // ASCII for A is 65
        /*
         * We want to print a pattern X using logic involving characters in this format
         * For input 5
         * A   E
         *  B D
         *   C
         *  B D
         * A   E
         */

        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++) 
            {
                if (i == j || i + j == size - 1) // Second condition is necessary because A is to be printed twice, at i = 0 and j = 0 and i = 5 and j = 0
                {                                // The two conditions alone provide us a formula to use to get our desired pattern.
                    System.out.print( (char)(start + j));
                } 
                else 
                {
                    System.out.print(" "); //System.out.println moves the printer to next line while system.out.print keeps it on the same line.
                }
            }
            System.out.println(); //This is similar to a cout << endl in C++
        }
        sc.close();
    }
}
