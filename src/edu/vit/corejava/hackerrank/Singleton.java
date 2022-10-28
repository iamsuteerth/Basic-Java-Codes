package edu.vit.corejava.hackerrank;

/*
 * @author Suteerth Subramaniam
 */

public class Singleton{
    private Singleton(){
        
    }
    public String str;
    private static Singleton S=new Singleton();
    public static Singleton getSingleInstance(){
        return S;
    }

}