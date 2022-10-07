package edu.vit.corejava.hackerrank;

/*
 * @author Suteerth Subramaniam
 */

import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0 ; i < 3 ; i++){
            String a = sc.nextLine();
            int ctr = 0;
            while(a.charAt(ctr)- 48 > 9 || a.charAt(ctr) == ' '){
                ctr++;
            } 
            String t1 = a.substring(0,ctr);
            String t2 = a.substring(ctr,a.length());
            System.out.printf("%-15s",t1);
            System.out.printf("%03d%n",Integer.parseInt(t2));
        }
        System.out.println("================================");
        sc.close();
        
    }
}
