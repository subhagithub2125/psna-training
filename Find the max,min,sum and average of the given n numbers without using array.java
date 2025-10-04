import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        while (true) {
            num = sc.nextInt();
            if (num == -1) {
                break;
            }
            
            sum += num;
            count++;
            
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
            System.out.println("Sum = " + sum);
            System.out.printf("Average = %.6f\n", average);
        } else {
            System.out.println("No numbers entered.");
        }
        
        sc.close();
    }
}
