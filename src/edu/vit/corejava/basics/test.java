package edu.vit.corejava.basics;
public class test{
    public static void main(String[] args) {
        int n = 536870912;
        double ans = ((double)Math.log(n)/(double)Math.log(2));
        if(Math.floor(ans)==ans){
            System.out.println(ans);;
        }
        else {
            System.out.println(ans+"NON");
        }
    }
}