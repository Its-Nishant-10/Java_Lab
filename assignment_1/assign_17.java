// Write a Java program to calculate the factorial of a number using a loop
package assignment_1;

import java.util.Scanner;

public class assign_17 {
    public static void main(String args[]) {
        System.out.println("Name - Nishant Nahar");
        System.out.println("Roll No - 241551078");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for which factorial is to be found:");
        int number = scan.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
        scan.close();
    }
}
