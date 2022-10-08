package edu.vit.corejava.hackerrank;

/*
 * @author Suteerth Subramaniam
 * This program is complicated too much because I was very bored while Coding this fella
 */

import java.util.Scanner;

public class StringIntroduction {
    public static String toTitleCase(String s) {
        String ans = null;
        Character temp = null;
        if (s.length() > 0) {

            if (s.charAt(0) >= 97 && s.charAt(0) <= 122) {
                temp = (char) ((int) s.charAt(0) - (int) 32);
            }
            try {
                ans = temp.toString() + s.substring(1);
            } catch (ArrayIndexOutOfBoundsException aib) {
                return temp.toString();
            }
            return ans;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b;
        a = sc.nextLine();
        b = sc.nextLine();
        sc.close();
        int c = (a.length() + b.length());
        String res;
        if ((a.compareTo(b)) > 0) {
            res = "Yes";
        } else {
            res = "No";
        }
        System.out.print(
                c + "\n" + res + "\n" + StringIntroduction.toTitleCase(a) + " " + StringIntroduction.toTitleCase(b));
    }
}
