package edu.vit.corejava.hackerrank;

/*
 * @author Suteerth Subramaniam
 */

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String n;
        for (int i = 0; i < num; i++) {
            n = sc.nextLine();
            try {
                Long.parseLong(n);
            } catch (NumberFormatException nfe) {
                System.out.println(n + " can't be fitted anywhere.");
            }
            try {
                long l = Long.parseLong(n);
                System.out.println(n + " can be fitted in:");
                if ((l <= Byte.MAX_VALUE) && (l >= Byte.MIN_VALUE)) {
                    System.out.println("* byte");
                }
                if ((l <= Short.MAX_VALUE) && (l >= Short.MIN_VALUE)) {
                    System.out.println("* short");
                }
                if ((l <= Integer.MAX_VALUE) && (l >= Integer.MIN_VALUE)) {
                    System.out.println("* int");
                }
                System.out.println("* long");
            } catch (NumberFormatException nfe) {
                continue;
            }
        }
        sc.close();
    }
}
