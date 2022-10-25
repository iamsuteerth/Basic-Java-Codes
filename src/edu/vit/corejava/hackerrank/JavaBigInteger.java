package edu.vit.corejava.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

/*
 * @author Sureerth Subramaniam
 */

public class JavaBigInteger {
    public static void main(String[] args) {
        BigInteger a,b;
        String at,bt;
        Scanner sc = new Scanner(System.in);

        at = sc.nextLine();
        bt = sc.nextLine();

        a = new BigInteger(at);
        b = new BigInteger(bt);

        BigInteger sum = a.add(b);
        BigInteger prod = a.multiply(b);
        
        System.out.println(sum.toString() + "\n" + prod.toString());
        sc.close();
    }
}
