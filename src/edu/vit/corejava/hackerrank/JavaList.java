package edu.vit.corejava.hackerrank;

/*
 * @author Suteerth Subramaniam
 */

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class JavaList {
    public static void main(String[] args) {
        int n, q;
        String query = "";
        List<Integer> list = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {

            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }

            q = sc.nextInt();
            for (int i = 0; i < q; i++) {

                query = sc.next();

                if (query.equals("Insert")) {
                    list.add(sc.nextInt(), sc.nextInt());
                }
                if (query.equals("Delete")) {
                    list.remove(sc.nextInt());
                }
            }
            // Print Block
            String s = "";
            for (int i = 0; i < list.size(); i++) {
                s += list.get(i);
                s += " ";
            }
            System.out.println(s);
        }
    }
}
