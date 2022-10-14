package edu.vit.corejava.hackerrank;

/*
 * @author Suteerth Subramaniam
 * In java 15 java lang version in hackerrank editor, there won't be any immutable code stub which is a fault on
 * their end. Use java lang version 8 since we are not using the new revision features for this particular problem.
 */

class Arithmetic {
    public Arithmetic(){
    };
    public int add(int a, int b){
        return a+b;
    };
}

class Adder extends Arithmetic{
    public Adder(){
    };
}


public class InheritanceII {
    // Below is the hidden code stub
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
        
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}
