/* Write a Java program to swap two numbers without using a third variable. */
package assignment_1;

import java.util.Scanner;

public class assign_10 {
    public static void main(String args[]) {
        System.out.println("Name - Nishant Nahar");
        System.out.println("Roll No - 241551078");
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the NUmbers to Swap");
        int b = a.nextInt();
        int c = a.nextInt();
        b = b + c;
        c = b - c;
        b = b - c;
        System.out.println("The Number After Swap are");
        System.out.println("Num 1 " + b);
        System.out.println("Num 2 " + c);
        a.close();
    }
}
