package edu.vit.corejava.hackerrank;

/*
 * @author Suteerth Subramaniam
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a,b;
        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println("%d".formatted(a/b));
        } catch (InputMismatchException ime) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException ae){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
