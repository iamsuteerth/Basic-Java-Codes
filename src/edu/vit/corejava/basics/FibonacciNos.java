/*
 * One of the most simple programs one can make in java, that is program to return nth fibonacci number
 * Methods are used in this program, taking both approaches to the problem
 * @author Suteerth Subramaniam
 */
package edu.vit.corejava.basics;

import java.util.Scanner;

public class FibonacciNos {
    public static int recursive_fibonacci(int n) { // Since n represents the position rather than index, i.e. 1st fibonacci is 0
        if (n == 1 || n == 2) {
            return (n-1); // For n=1, we get 0 and for n = 2, we get 1. Which are 1st and 2nd fibonacci values respectively
        } else {
            return ((recursive_fibonacci(n - 1)) + (recursive_fibonacci(n - 2))); // Standard Recursive approach to get fibonacci values
        }
    }
    // NOTE - A Recursive method is a method which calls itself, as you can see here.

    // Now we will see an iterative approach to the problem
    public static int iterative_fibonacci(int n) {
        int temp = 0, b = 0, a = 1; // Temp is our control value, a is the predecessor and b is the pre predecessor 
        if (n == 1 || n == 2){
            return (n-1); // As mentioned in recursive approach
        }
        for (int i = 2; i < n; i++) { //We are starting from 2 because we have handled the first two cases already.
            temp = a + b; // The control value is a sum of previous two values
            b = a;        // The pre predecessor value takes the predecessor value and predecessor value takes the control value
            a = temp;     // For the next iteration
        }
        return temp;
    }

    public static void fibonacci_series(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(iterative_fibonacci(i)); // This function just prints the values from iterative fibonacci in a list like fashion
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of fibonacci");
        int n = sc.nextInt();
        for (; n <= 0;) {
            System.out.println("Enter proper integer value");
            n = sc.nextInt();
        }
        System.out.println(n+"th Fibonacci is " + recursive_fibonacci(n)); // Obtaining the Nth fibonacci using recursive function
        System.out.println(n+"th Fibonacci is " + iterative_fibonacci(n)); // Obtaining the Nth fibonacci using iterative function
        System.out.println();
        System.out.println("Series");
        fibonacci_series(n);
        sc.close();
    }
}
