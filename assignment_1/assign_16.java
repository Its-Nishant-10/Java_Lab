// Write a Java program to check whether a given year is a leap year or not
package assignment_1;

import java.util.Scanner;

public class assign_16 {
    public static void main(String args[]) {
        System.out.println("Name - Nishant Nahar");
        System.out.println("Roll No - 241551078");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scan.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("The year is a leap year");
                } else {
                    System.out.println("The year is not a leap year");
                }
            } else {
                System.out.println("The year is a leap year");
            }
        } else {
            System.out.println("The year is not a leap year");
        }
        scan.close();
    }
}