/* Write a Java program to check whether a number is divisible by both 3 and 5 */
package assignment_1;

import java.util.Scanner;

public class assign_13 {
    public static void main(String args[]) {
        System.out.println("Name - Nishant Nahar");
        System.out.println("Roll No - 241551078");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number to be checked");
        int a = scan.nextInt();
        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("The number is divisible by both 3 and 5");
        } else {
            System.out.println("The number is not divisble by both 3 and 5");
        }
        scan.close();
    }
}
