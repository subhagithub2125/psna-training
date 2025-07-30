import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String tc = sc.nextLine();
        String[] t = tc.split(":");
        int hours = Integer.parseInt(t[0]);
        int minutes = Integer.parseInt(t[1]);
        int seconds = Integer.parseInt(t[2]);
        if(hours<=23 && hours>=0 && minutes<=59 && minutes>=0 && seconds<=59 && seconds>=0)
            System.out.println("Valid");
        else
            System.out.println("Not Valid");
    }
}
