/*
 * You need to create a class Number which has a number and methods to return T/F on the conditions whether the number IS triangular or NOT
 * & whether it IS a perfect square or NOT
 * @author Suteerh Subramaniam
 */
package edu.vit.corejava.challenges;

import java.util.Scanner;

public class ChallengeOne {
    public static void main(String[] args) {

        class Number{
            int num;
            Number(){};
            public Number setNumber(int n){
                this.num = n;
                return this;
            }
            public int getNum(){
                return this.num;
            }
            public boolean isTriangular(){
                int x = 1;
                int triangular_number = 1;
                while (triangular_number < num){
                    x++;
                    triangular_number+=x;
                    if (triangular_number == num){
                        return true;
                    }
                }
                return false;
            }
            public boolean isSquare(){
                // Method below is not that efficient
                // int x = 0;
                // int square = 0;
                // while (square < num){
                //     square = x*x;
                //     if(num == square){
                //         return true;
                //     }
                //     x++;
                // }
                // return false;
                double squareroot = Math.sqrt((double)num);
                return squareroot == Math.floor(squareroot) ? true : false; 
            }
            
        }
        //Main Program
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        Number n = new Number().setNumber(sc.nextInt());
        System.out.println("Number " + n.getNum() 
                            + "\n" + "Square " + n.isSquare()
                            +"\nTriangular " + n.isTriangular());
        sc.close();
    }
}
