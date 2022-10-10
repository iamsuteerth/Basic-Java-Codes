package edu.vit.corejava.hackerrank;

/*
 * @uathor Suteerth Subramaniam
 */

import java.util.Scanner;

public class SubstringComparisons {
    public static String getSmallestAndLargest(String str, int k) {
        String smallest = "";
        String largest = "";
        for (int i = 0; ((i < str.length()) && (i + k <= str.length())); i++) {
            String substr = str.substring(i, i + k);
            if (substr.compareTo(smallest) < 0 || smallest.isEmpty()) {
                smallest = substr;
            }
            if (substr.compareTo(largest) > 0 || largest.isEmpty()) {
                largest = substr;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        String str;
        int k;
        try (Scanner sc = new Scanner(System.in);) {
            str = sc.nextLine();
            k = sc.nextInt();
        }
        System.out.println(getSmallestAndLargest(str, k));
    }
}
