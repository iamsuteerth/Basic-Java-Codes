package edu.vit.corejava.hackerrank;

/*
 * @author Suteerth Subramaniam
 * Use java 8 to get Rs. since Java 15 uses different formats and the question hasn't been updated yet
 */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double val = sc.nextDouble();
        sc.close();
        String us, in, ch, fr;
        us = NumberFormat.getCurrencyInstance(Locale.US).format(val);
        in = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(val);
        ch = NumberFormat.getCurrencyInstance(Locale.CHINA).format(val);
        fr = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(val);

        System.out.println("US: " + us);
        System.out.println("India: " + in);
        System.out.println("China: " + ch);
        System.out.println("France: " + fr);
    }
}
