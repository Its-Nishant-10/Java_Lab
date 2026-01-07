/* Write a Java program to reverse a given integer (example: 1234 → 4321). */
package assignment_1;

import java.util.Scanner;

public class assign_19 {
    public static void main(String args[]) {
        System.out.println("Name - Nishant Nahar");
        System.out.println("Roll No - 241551078");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to be reversed");
        int num = scan.nextInt();
        int revnum = 0;
        while (num != 0) {
            int temp = num % 10;
            revnum = revnum * 10 + temp;
            num = num / 10;
        }
        System.out.println("The reversed number is " + revnum);
        scan.close();
    }
}
