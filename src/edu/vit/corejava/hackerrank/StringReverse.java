package edu.vit.corejava.hackerrank;

/*
 * @author Suteerth Subramaniam
 */

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String revA = "";
        for (int i = A.length() - 1 ; i>=0 ; i-- ) {
            revA += A.charAt(i);
        }
        if (A.compareTo(revA) == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        sc.close();
    }
}
