/* Write a Java program to calculate the simple interest */
package assignment_1;

import java.util.Scanner;

public class assign_14 {
    public static void main(String args[]) {
        System.out.println("Name - Nishant Nahar");
        System.out.println("Roll No - 241551078");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Principle Amount");
        double p = scan.nextDouble();
        System.out.println("Enter the Rate of Interest");
        double r = scan.nextDouble();
        System.out.println("Enter the time period");
        double t = scan.nextDouble();
        double SI = (p * r * t) / 100;
        System.out.println("The Simple Interest is " + SI);
        scan.close();
    }
}
