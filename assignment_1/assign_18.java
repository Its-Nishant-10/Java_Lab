/* .Write a Java program to print all numbers from 1 to N that are divisible by 7 */
package assignment_1;

import java.util.Scanner;

public class assign_18 {
    public static void main(String args[]) {
        System.out.println("Name - Nishant Nahar");
        System.out.println("Roll No - 241551078");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number till u want to check");
        int num = scan.nextInt();
        int a = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
                a++;
            }
        }
        if (a == 0) {
            System.out.println("No number is divisible by 7 till " + num);
        }
        scan.close();
    }
}
