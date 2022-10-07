package edu.vit.corejava.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * @author Suteerth Subramaniam
 */

public class JavaLoopsI {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i = 1 ; i <=10 ; i++){
            System.out.println(N+" x "+i+" = "+(N*i));
        }
        bufferedReader.close();
    }
}
