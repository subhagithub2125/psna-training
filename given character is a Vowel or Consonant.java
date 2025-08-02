import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch == 'A' || ch == 'a'  || ch == 'E' || ch == 'e' || ch == 'I' ||  ch =='i' || ch == 'O' || ch == 'o'|| ch == 'U' || ch == 'u')
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}
