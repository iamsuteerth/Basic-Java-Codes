package edu.vit.corejava.hackerrank;

/*
 * @author Suteerth Subramaniam
 */

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] array = s.trim().split("[!,?._'@ ]+");
        int size = 0;
        if (s.trim().isEmpty()) {
            System.out.println(size);
        } else {
            for (String string : array) {
                size++;
            }
            System.out.println(size);
            for (String string : array) {
                System.out.println(string);
            }
        }
        scan.close();
    }
}
