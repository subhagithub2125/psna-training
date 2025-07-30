import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();  // Input format: dd/mm/yyyy

        // Split the date using "/"
        String[] parts = date.split("/");
        
        if (parts.length != 3) {
            System.out.println("Invalid");
            return;
        }

        int day, month, year;
        
        try {
            day = Integer.parseInt(parts[0]);
            month = Integer.parseInt(parts[1]);
            year = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid");
            return;
        }

        if (isValidDate(day, month, year)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public static boolean isValidDate(int day, int month, int year) {
        // Check year range
        if (year < 1900 || year > 9999)
            return false;

        // Check month range
        if (month < 1 || month > 12)
            return false;

        // Days in each month
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Leap year adjustment
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        // Check day range
        return day >= 1 && day <= daysInMonth[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
