import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
  "July", "August", "September", "October", "November", "December" };

        if(month >= 1 && month <= 12){
            System.out.println(months[month - 1]);
        }
        else{
            System.out.println("Invalid");
        }                  
    }
}
