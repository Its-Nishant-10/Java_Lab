/* Write a Java program to take your name and age as input and print:
   Hello <name>, your age is <age> */
package assignment_1;

import java.util.Scanner;

public class assign_6 {
    public static void main(String args[]) {
        System.out.println("Name - Nishant Nahar");
        System.out.println("Roll No - 241551078");
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = a.nextLine();
        System.out.println("Enter Your age");
        int age = a.nextInt();
        System.out.println("Hello " + name + ", your age is " + age);
        a.close();
    }
}