// Write a Java program to check whether a number is even or odd.
package assignment_1;

import java.util.Scanner;

public class assign_11 {
    public static void main(String args[]) {
        System.out.println("Name - Nishant Nahar");
        System.out.println("Roll No - 241551078");
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = a.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        a.close();
    }
}
