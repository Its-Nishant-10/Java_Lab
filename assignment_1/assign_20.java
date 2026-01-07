/* Write a Java program to find the largest among three numbers using conditional statements (no built-in functions) */
package assignment_1;

import java.util.Scanner;

public class assign_20 {
    public static void main(String args[]) {
        System.out.println("Name - Nishant Nahar");
        System.out.println("Roll No - 241551078");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the three numbers to be compared:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a > b && a > c) {
            System.out.println("The largest number is " + a);
        } else if (b > a && b > c) {
            System.out.println("The largest number is " + b);
        } else {
            System.out.println("The largest number is " + c);
        }
        scan.close();
    }
}
