/* Write a Java program to read two integers and print the larger number */
package assignment_1;

import java.util.Scanner;

public class assign_12 {
    public static void main(String args[]) {
        System.out.println("Name - Nishant Nahar");
        System.out.println("Roll No - 241551078");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Num 1");
        int a = scan.nextInt();
        System.out.println("Enter Num 2");
        int b = scan.nextInt();
        if (a > b) {
            System.out.println(a + " is larger than " + b);
            System.out.println("The larger Number is " + a);
        } else {
            System.out.println(b + "is larger than " + a);
            System.out.println("The larger Number is " + b);
        }
        scan.close();
    }
}
