
/* Write a Java program to find the area of a circle using radius given by the user. */
package assignment_1;

import java.util.Scanner;

public class assign_7 {
    public static void main(String args[]) {
        System.out.println("Name - Nishant Nahar");
        System.out.println("Roll No - 241551078");
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int rad = a.nextInt();
        double area = 3.14 * rad * rad;
        System.out.println("The area of circle with radius " + rad + " is " + area);
        a.close();
    }
}
