/*
 * @author Suteerth Subramaniam
 * This program calculates the frequency of numbers occurring in a string using ASCII values. A simple algorithm is applied here.
 * There are more efficient ways to solve this problem but we will look at a method involving various topics.
 */
package edu.vit.corejava.basics;

import java.util.ArrayList;
import java.util.Scanner;

public class DigitFrequencyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        
        //Standard method to take string input, since we didn't invoke a nextInt(), we dont need a blank next statement to consume the newline character.
        int[] key = new int[10]; // This array contains the digits which will be used as a reference to calculate the digit frequency
        int[] freq = new int[10];// This array holds the frequency of digits, the index corresponds to the frequency of that digit.

        ArrayList<Integer> array = new ArrayList<Integer>(); // To store the integer values in a dynamic array, we use an arraylist
        for (int i = 0; i <= 9; i++) {
            key[i] = i; // Storing values from 0 to 9 in key using a loop
            freq[i] = (int) 0; // Storing a default value of zero using a loop
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) <= '9' && str.charAt(i) >= '0') // Basic IF CHECK to make sure that the character at index is an integer
            {
                array.add((int) ((int) str.charAt(i) - ((int) '0'))); // Typecasting into INT and adding the integer to the arraylist
            }
            /*
             * Here, we demonstrate maths involving ASCII Values
             * For example, ASCI value for zero is 48, so the character in the string at i
             * index will be subtracted by 48 to give the necessary integer
             * 49-48 = 1 ; ASCII for 1 is 49
             */
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < array.size(); j++) { // 2nd loop is for iterating through the arraylist, hence the array.size() method
                if (array.get(j) == key[i]) { // Basic if check to increase the frequency of the digit if the numbre in arraylist matches any number in key
                    freq[i]++;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Frequency of " + i +" "+freq[i]); // Printing the net frequency of digits on the console
        }
        sc.close();
    }
}
