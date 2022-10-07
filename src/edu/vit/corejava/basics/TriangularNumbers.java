/*
 * @author Suteerth Subramaniam
 * This program is for printing triangular numbers.
 * Simple for loops are used and Scanner classs is used for taking in input from the user.
 */
package edu.vit.corejava.basics;

import java.util.Scanner;

public class TriangularNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many triangular numbers do you want to print.");
        int n = sc.nextInt();
        int num = 0; //Triangular Numbers are series of numbers obtained by summation of natural numbers
        for (int i = 1; i <= n; i++) {
            num += i;
            System.out.println(num);
        }
        sc.close(); //Good Practice to do so.
    }
}
