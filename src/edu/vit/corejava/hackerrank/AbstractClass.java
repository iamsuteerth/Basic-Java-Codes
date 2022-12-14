package edu.vit.corejava.hackerrank;

/*
 * @author Suteerth Subramaniam
 */

import java.util.Scanner;

abstract class Book{
    // Here, the property title is having default visibility, getTitle method also has default visibility which means that
    // they can be accessed within this package 
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
	
}

class MyBook extends Book{
    public void setTitle(String s){
        this.title = s;
    }
}

public class AbstractClass {
    public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();
		
	}
}
