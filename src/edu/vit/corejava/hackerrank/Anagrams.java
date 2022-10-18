package edu.vit.corejava.hackerrank;

/*
 * @author Suteerth Subramaniam
 */

import java.util.Scanner;

public class Anagrams {
    /*
     * I chose a very simple approach, two strings which are anagrams will be the same once they are sorted
     * So i convert these strings into an array first, then since we are not allowed to import anything other than Scanner
     * I create my own sorting function implementing ASCII Value based Merge Sort with time complexity O(NlogN) so it is efficient 
     * Beginners can go with a simple bubble sort, it will work just fine!
     */
    public static void merge(char arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        char L[] = new char [n1];
        char R[] = new char [n2];

        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void sort(char arr[], int l, int r)
    {
        if (l < r)
        {
            int m = (l+r)/2;
            sort(arr, l, m);
            sort(arr , m+1, r);
            merge(arr, l, m, r);
        }
    }
    public static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length() == b.length()){
            char[] aArray = a.toCharArray();
            char[] bArray = b.toCharArray();
            Anagrams.sort(aArray, 0, aArray.length - 1);
            Anagrams.sort(bArray, 0, bArray.length - 1);
            for (int i = 0; i < bArray.length; i++) {
                if(aArray[i] == bArray[i]){
                    continue;
                }
                else {
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
