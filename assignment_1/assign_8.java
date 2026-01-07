/* Write a Java program to convert temperature from Celsius to Fahrenheit. */
package assignment_1;

import java.util.Scanner;

public class assign_8 {
    public static void main(String args[]) {
        System.out.println("Name - Nishant Nahar");
        System.out.println("Roll No - 241551078");
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the Temp in Celcius");
        double cel = a.nextDouble();
        double far = (cel * 9 / 5) + 32;
        System.out.println("The Farhenheit Temp of " + cel + " Celcius is " + far);
        a.close();
    }
}
