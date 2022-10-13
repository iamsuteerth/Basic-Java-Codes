package edu.vit.corejava.hackerrank;

/*
 * @author Suteerth Subramaniam
 */

class Animal {
    public Animal() {
    };

    public void walk() {
        System.out.println("I am walking");
    }
}

class Bird extends Animal {
    public Bird() {
    };

    public void fly() {
        System.out.println("I am flying");
    }

    public void sing() {
        System.out.println("I am singing");
    }
}

public class InheritanceI {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}