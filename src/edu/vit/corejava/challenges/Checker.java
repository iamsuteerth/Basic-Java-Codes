package edu.vit.corejava.challenges;
import java.util.Scanner;
public class Checker {
    public static void main(String[] args) {
        String password;
        Scanner sc = new Scanner(System.in);
        boolean state = true;
        while (state) {
            System.out.print("Enter a password : ");
            password = sc.nextLine();
            if(password.length()<=10 || !(password.matches("[0-9]+[A-Z]+[a-z]+[!@#$%^&*]+"))){
                System.out.println("Invalid Password! Enter Again!");
            }
            else{
                System.out.println("Password is "+password);
                state = !state;
            }
        }
        sc.close();
    }
}
