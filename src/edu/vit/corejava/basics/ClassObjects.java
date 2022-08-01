/*
 * This program covers basics of class and it's methods and objects.
 * @author Suteerth Subramaniam
 */
package edu.vit.corejava.basics;

public class ClassObjects {
    public static void main(String[] args) {
        class User { // We are creating a class with 2 variables as it's properties and 2 methods
            // This class' scope is main() function only
            int score, favNumber;

            public boolean hasWon() {
                return (score > 100) ? true : false; // Simple usage of if...else using ternary operators
            }

            public void checker() {
                if (favNumber >= 0) {
                    System.out.println("Positive");
                } else {
                    System.out.println("Not Positive");
                }
            }
        }
        class UserTwo { // We create a class to demonstrate builder patterns and constructors
            int id;
            String name;

            UserTwo() {
            }; // This is necessary to start using builder patterns which will be demonstrated
               // below

            // Constructor involving parameters
            UserTwo(int x, String s) { // A constructor is a special function which has the same name as the class
                id = x; // Constructors are used to give values to objects when they are constructed
                name = s; // Here we use our constructor to assign name and id values
            }

            // Another elegant way of using constructors is in builder patterns

            public UserTwo setId(int n) { // setId is like a method of the constructor
                this.id = n; // this is the context or reference to the object which has called it
                return this; // The object with the value assigned is returned
            }

            public UserTwo setName(String s) {
                this.name = s;
                return this;
            }

            public void getData() {
                System.out.println("Id " + this.id + " Name " + this.name); // this is basically reference to the entity
                                                                            // calling the function, here, it's the
                                                                            // invoking object.
            }
        }

        User dummy = new User(); // Syntax to create a new object. We are actually calling a constructor
        dummy.score = 10;
        System.out.println(dummy.score);
        System.out.println(dummy.hasWon());
        dummy.favNumber = -1;
        dummy.checker();

        UserTwo dummytwo = new UserTwo() // Builder Pattern
                                .setId(1)
                                .setName("First");
        // How we use builder patterns
        UserTwo dummythree = new UserTwo(2, "Second"); // Using constructor directly
        dummytwo.getData();
        dummythree.getData();
    }
}
