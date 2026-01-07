//     Write a Java program to print the following pattern:
//     *
//     **
//     ***
//     ****
package assignment_1;

public class assign_2 {
    public static void main(String args[]) {
        System.out.println("Name - Nishant Nahar");
        System.out.println("Roll No - 241551078");
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
