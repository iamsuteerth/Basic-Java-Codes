package edu.vit.corejava.hackerrank;

/*
 * @author Suteerth Subramaniam
 */

import java.util.Scanner;
import java.util.regex.*;

class myRegex {
    private String pattern;
    
    public myRegex() {
        String zeroTo255
            = "(\\d{1,2}|(0|1)\\"
              + "d{2}|2[0-4]\\d|25[0-5])";
        this.pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
    }

    public String getPattern() {
        return this.pattern;
    }
}

public class JavaRegex {
    // A very simple method, which HR doesn't accept but it's the same thing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String ip = sc.nextLine();
            Boolean ans = (Pattern.matches(new myRegex().getPattern(), ip)) ? true : false;
            System.out.println(ans.toString());
        }
        sc.close();
    }
}
