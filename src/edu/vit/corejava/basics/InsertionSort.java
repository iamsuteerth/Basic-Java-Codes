/*
 * We implement one of the simple sorting techniques slightly better than the most simple sorting i.e. (Bubble Sort)
 * This method is called Insertion sort and the meaning is derivative :D
 * @author Suteerth Subramaniam
 */
package edu.vit.corejava.basics;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        int n, key, j, i; 
        // The key is what we will store to create a "hole"
        System.out.println("Enter how many elements do you want to enter");
        n = sc.nextInt();
        sc.nextLine();
        array = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("Enter Element " + i);
            array[i] = sc.nextInt();
        }
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(array) + "\n");
        // Now we perform insertion sort, keep this fact in mind that one element is always sorted in an array :D
        for (i = 1; i < array.length; ++i) { // We start from index 1 because out sorted array is of size 1 in beginning
            key = array[i]; // Assign key
            j = i - 1; // Obviously we want to compare the element before i, so i - 1
            while (j >= 0 && array[j] > key) { // Index j should be in bounds and an important condition is that whatever element we shift to j+1 must be less than key for termination
                array[j + 1] = array[j]; // This is our shifting
                j--;
            }
            array[j + 1] = key; // We use j+1 here because the actual place where we have to place our key is one index behind of what we want
        }
        System.out.println(Arrays.toString(array));
        sc.close();
    }
}
