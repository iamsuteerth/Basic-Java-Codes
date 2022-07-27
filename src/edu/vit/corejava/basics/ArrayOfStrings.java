/*
 * This program shows how we can deal with array of strings, both fixed and mutable.
 */
package edu.vit.corejava.basics;

import java.util.*;

public class ArrayOfStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();

        System.out.println("Enter how many names do you want to enter?");
        int n = sc.nextInt();

        System.out.println();

        for (int i = 1; i <= n; i++) 
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
        namesTwo = new String[(int) names.size()]; //We need to specify the size for the array unlike ArrayList which is 
        for (int i = 0; i < names.size()  ; i++)    //a disadvantage
        {   
            namesTwo[i] = names.get(i).toString();
        }
        for (String itr : namesTwo) 
        {
            System.out.println(itr);
        }
        sc.close(); //Always a good practice
    }
}
