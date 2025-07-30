import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();  // Read the input

        String[] days = {
            "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        };

        // Print day if input is between 0 and 6, else print Invalid
        if (day >= 0 && day <= 6) {
            System.out.println(days[day]);
        } else {
            System.out.println("Invalid");
        }
    }
}
       
