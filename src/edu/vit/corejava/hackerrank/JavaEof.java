package edu.vit.corejava.hackerrank;

import java.util.Scanner;

/* 
 * @author Suteerth Subramaniam
 */

public class JavaEof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = 0;
        String s;
        while(sc.hasNext()){
            s = sc.nextLine();
            lines++;
            System.out.println(lines + " " + s);
        }
        sc.close();
    }
}
