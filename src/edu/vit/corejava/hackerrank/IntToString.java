package edu.vit.corejava.hackerrank;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        if(n <=100 || n >= -100){
            // String s = Integer.toString(n);
            System.out.println("Good job");
        }
        else {
            System.out.println("Wrong answer");
        }
        sc.close();
    } 
}
