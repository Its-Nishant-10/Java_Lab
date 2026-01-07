/* Write a Java program to swap two numbers using a third variable */
package assignment_1;

import java.util.Scanner;

public class assign_9 {
    public static void main(String args[]) {
        System.out.println("Name - Nishant Nahar");
        System.out.println("Roll No - 241551078");
        Scanner a = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = a.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = a.nextInt();
        int swap;
        swap = num1;
        num1 = num2;
        num2 = swap;
        System.out.println("The Number After swap are:");
        System.out.println("Number 1 " + num1);
        System.out.println("Number 2 " + num2);
        a.close();
    }
}
