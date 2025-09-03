import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        double hra,da;
        if(basic <= 10000){
            hra = 0.20 * basic;
            da = 0.80 * basic;
        }
        else if(basic <= 20000){
            hra = 0.25 * basic;
            da = 0.90 * basic;
        }
        else{
            hra = 0.30 * basic;
            da = 0.95 * basic;
        }
        double grossSalary = basic + hra + da;
        System.out.printf("Rs.%.2f\n", grossSalary);
    }
}
