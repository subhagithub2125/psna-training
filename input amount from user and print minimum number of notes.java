import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int n500 = 0, n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 0;
        if(amount >= 500){
            n500 = amount / 500;
            amount = amount % 500;
        }
        if(amount >= 100){
            n100 = amount / 100;
            amount = amount % 100;
        }
        if(amount >= 50){
            n50 = amount / 50;
            amount = amount % 50;
        }
        if(amount >= 20){
            n20 = amount / 20;
            amount = amount % 20;
        }
        if(amount >= 10){
            n10 = amount / 10;
            amount = amount % 10;
        }
        if(amount >= 5){
            n5 = amount / 5;
            amount = amount % 5;
        }
       if(amount >= 2){
           n2 = amount / 2;
           amount = amount % 2;             
        }
       if(amount >= 1){
           n1 = amount / 1;
           amount = amount % 1;             
        }
         System.out.println("Total number of notes:");
        System.out.println("500 : " + n500);
        System.out.println("100 : " + n100);
        System.out.println("50 : " + n50);
        System.out.println("20 : " + n20);
        System.out.println("10 : " + n10);
        System.out.println("5 : " + n5);
        System.out.println("2 : " + n2);
        System.out.println("1 : " + n1);
        
    }
}
