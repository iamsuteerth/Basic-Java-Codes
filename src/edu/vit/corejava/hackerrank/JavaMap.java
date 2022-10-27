package edu.vit.corejava.hackerrank;

/*
 * @author Suteerth Subramaniam
 */

// I have used hashmap for quickly searching, this is similar to my solution for Two Sum problem which is available in my leetcode github repo.

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class JavaMap {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String s;
        Map<String, String> hmap = new HashMap<String, String>();

        for (int i = 0; i < n; i++) {
            hmap.put(in.nextLine(), in.nextLine());
        }
        while (in.hasNext()) {
            s = in.nextLine();
            if (hmap.get(s) != null) {
                System.out.println(s + "=" + hmap.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
