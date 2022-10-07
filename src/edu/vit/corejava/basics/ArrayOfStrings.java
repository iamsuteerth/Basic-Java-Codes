/*
 * @author Suteerth Subramaniam
 * This program shows how we can deal with array of strings, both fixed and mutable.
 */
package edu.vit.corejava.basics;

import java.util.*;

public class ArrayOfStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // In order to use Scanner, we need to creae an object of scanner class which can call it's methods
        ArrayList<String> names = new ArrayList<String>(); //Similar to Scanner, we create an object of ArrayList type

        System.out.println("Enter how many names do you want to enter?");
        int n = sc.nextInt(); 
        // It is important to understand how the code is read by the machine, in order to consume a newline character created by nextInt(), 
        // We use a nextLine() command to consume it.
        sc.nextLine();

        for (int i = 1; i <= n; i++) // Simple for loops
        {
            System.out.println("Enter name " + i);
            names.add(sc.next());
        }

        // Now we will print all the elements of the list and perform some operations
        // The differences shall be visible very easily

        for (int i = 1; i <= n; i++) 
        {
            System.out.println("String " + i + " " + names.get(i-1).toString());
        }

        System.out.println("Enter the element you want to delete.");
        n = sc.nextInt();

        names.remove(n-1);
        
        System.out.println("After deletion");

        for (int i = 0; i < names.size(); i++) 
        {
            System.out.println("String " + (i+1) + " " + names.get(i).toString()); 
        }
        // Now we will pass the array to a loop and print elements in that way
        String[] namesTwo; //Declaration
        namesTwo = new String[(int) names.size()]; // We need to specify the size for the array unlike ArrayList which is 
        for (int i = 0; i < names.size()  ; i++)    // a disadvantage
        {   
            namesTwo[i] = names.get(i).toString();
        }
        // The for loop below is an enhanced for loop, a feature in java, there will be a seperate file showing its use.
        for (String itr : namesTwo) 
        {
            System.out.println(itr);
        }
        sc.close(); //Always a good practice
    }
}
