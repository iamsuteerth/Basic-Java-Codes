/*
 * @author Suteerth Subramaniam
 */
package edu.vit.corejava.challenges;
import java.util.Scanner;
import java.util.ArrayList;
public class ChallengeTwo {
    public static void main(String[] args){
        
        //Declarations of variables used in the code
        //Store will have 5 items
        
        Scanner sc = new Scanner(System.in);
        int[] availability = new int[5]; //Stores the availability of items
        float[] prices = new float[5]; //Stores price of items
        String[] productNames = new String[5]; // Stores Names of products
        String flag; //To exit the loop
        ArrayList<String> cart = new ArrayList<String>(); //Adds into cart
        boolean state = true; //Loop controller
        int prodId; //Index Token
        int itemCode=0; // Cart counter
        
        //Assignments to the store
        productNames[0] = "Zinger Burger"         ; availability[0] = 8  ; prices[0] = 180f;
        productNames[1] = "McSpicy Burger"        ; availability[1] = 8  ; prices[1] = 100f;
        productNames[2] = "McVeggie Burger"       ; availability[2] = 12 ; prices[2] = 70.5f;
        productNames[3] = "McAloo Burger"         ; availability[3] = 14 ; prices[3] = 56f;
        productNames[4] = "American Cheese Burger"; availability[4] = 0  ; prices[4] = 212f;
        
        //Main Program
        while(state){
            
            System.out.println("------------------------------------");
            displayStore(productNames, availability);
            
            System.out.println("Enter Item intex to add into cart");
            prodId = sc.nextInt();
            sc.nextLine();
            
            itemCode = userInput(cart, productNames, availability, prodId, itemCode, prices);
            displayCart(cart);
            
            System.out.println("Do you want to continue? yes/no");
            flag = sc.nextLine();
            flag.toLowerCase();
            
            if(flag.equals("yes")){	 	  	 	 		      	  		    	        	 	
                state = true;
            }
            else {
                state = false;
            }
        }
        sc.close();
    }
    public static int userInput(ArrayList<String> cart, String[] productNames, int[] availability, int index, int itemCode, float[] prices){
        if(availability[index] > 0){
            availability[index]--;
            itemCode++;
            String temp = "Item code : "+Integer.toString(itemCode)+", Name : "+productNames[index]+", Price : "+Float.toString(prices[index]); 
            cart.add(temp);
            return itemCode;
        }
        else {
            System.out.println("------------------------------------");
            System.out.println("Item NOT available!");
            System.out.println("------------------------------------");
            return itemCode;
        }
    }
    public static void displayCart(ArrayList<String> list){
        System.out.println("------------------------------------");
        for(String printed : list){
            System.out.println(printed);
        }
        System.out.println("------------------------------------");
    }
    public static void displayStore(String[] productNames, int[] availability){
        for(int i = 0 ; i < availability.length ; i++ ){
            System.out.println(i + " : " + productNames[i] + " " + "(" +availability[i]+")");
        }
    }
}	 	  	 	 		      	  		    	        	 	
