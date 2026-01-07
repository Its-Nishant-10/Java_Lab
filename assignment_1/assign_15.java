/* Write a Java program that takes marks of 5 subjects and prints the total and percentage */
package assignment_1;

import java.util.Scanner;

public class assign_15 {
    public static void main(String args[]) {
        System.out.println("Name - Nishant Nahar");
        System.out.println("Roll No - 241551078");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Marks in 5 Subjects (Out of 100):");
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();
        float d = scan.nextFloat();
        float e = scan.nextFloat();
        float total = a + b + c + d + e;
        float avg = total / 5;
        float percentage = total / 500 * 100;
        System.out.println("The total marks obtained is " + total);
        System.out.println("The average marks obtained is " + avg);
        System.out.println("The percentage is " + percentage);
        scan.close();
    }
}
