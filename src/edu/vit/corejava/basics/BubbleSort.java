/* 
 * @author Suteerth Subramaniaam
 * This program showcases the SIMPLEST form of sorting technique involving to for loops 
 */
package edu.vit.corejava.basics;

import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        boolean swapped; // This is to implement an optimized bubble sort which saves some iterations.
        Scanner sc = new Scanner(System.in);
        int[] array; // Initializing an array
        int n, temp;
        System.out.println("Enter how many elements do you want to enter");
        n = sc.nextInt();
        sc.nextLine();
        array = new int[n];
        // Taking input for the array
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element " + i);
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) { // We are going till n-1 because we can't compare the last element with anything beyond it
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) { // Comparing j and j+1 element and swapping if condition is true
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){ // If the outer for loop returns false, that is array is sorted already, we can exit the loop instantly
                break;     // This makes it optimized 
            }
        }
        System.out.println(Arrays.toString(array));
        sc.close();
    }
}
