import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;

        // Handle factor 2
        while (num % 2 == 0) {
            count++;
            num /= 2;
        }
        if (count > 0) {
            System.out.println(2 + "->" + count);
        }

        // Handle odd factors
        for (int i = 3; i * i <= num; i += 2) {
            count = 0;
            while (num % i == 0) {
                count++;
                num /= i;
            }
            if (count > 0) {
                System.out.println(i + "->" + count);
            }
        }

        // If remaining number is a prime
        if (num > 2) {
            System.out.println(num + "->1");
        }
    }
}
