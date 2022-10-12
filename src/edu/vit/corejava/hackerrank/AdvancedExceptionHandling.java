package edu.vit.corejava.hackerrank;

/*
 * @author Suteerth Subramaniam
 */

import java.util.Scanner;

class NegativeException extends Exception {
    public NegativeException(String str) {
        super(str);
    }
    @Override
    public String toString(){
        return ("java.lang.Exception: n and p should not be negative.");
    }
}

class ZeroException extends Exception {
    public ZeroException(String str) {
        super(str);
    }
    @Override
    public String toString(){
        return ("java.lang.Exception: n and p should not be zero.");
    }
}

class MyCalculator {
    public static long power(int n, int p) throws NegativeException, ZeroException {
        if (p < 0 || n < 0) {
            throw new NegativeException("n and p should not be negative.");
        }
        if (p == 0 && n == 0) {
            throw new ZeroException("n and p should not be zero.");
        }

        Double d = Math.pow(n, p);
        long ans = (d.longValue());
        return ans;
    }
}

public class AdvancedExceptionHandling {
    public static void main(String[] args) {
        int a = 0, b = 0;
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                try {
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println(MyCalculator.power(a, b));
                }
                catch (ZeroException ze) {
                    System.out.println(ze.toString());
                } catch (NegativeException ne) {
                    System.out.println(ne.toString());
                }
            }
        } 
    }

}
