package edu.vit.corejava.hackerrank;

/*
 * @author Suteerth Subramaniam
 */

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfQueries;
        numberOfQueries = sc.nextInt();
        for (int i = 0; i < numberOfQueries; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                a += (int) b * Math.pow(2, j);
                System.out.printf("%d", a);
                if (j != n) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
