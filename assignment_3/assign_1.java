
/*
 * Create a Student class and store details of N students in an
 * array of objects. Print the student having the highest average marks.
 */
import java.util.*;

class Stud_1 {
    int roll;
    String name;
    int mar1, mar2, mar3;

    double avg() {
        return (mar1 + mar2 + mar3) / 3.0;
    }

    public static void main(String args[]) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Stud_1");
        int n = sc.nextInt();
        Stud_1 s[] = new Stud_1[n];
        for (int i = 0; i < s.length; i++) {
            s[i] = new Stud_1();
            System.out.print("Roll No ");
            s[i].roll = sc.nextInt();
            System.out.print("Name ");
            s[i].name = sc.next();
            System.out.print("Marks ( 3 Subs - Phy, Chem and Maths) : ");
            s[i].mar1 = sc.nextInt();
            s[i].mar2 = sc.nextInt();
            s[i].mar3 = sc.nextInt();
        }
        Stud_1 high = s[0];
        for (int i = 1; i < s.length; i++) {
            if (s[i].avg() > high.avg()) {
                high = s[i];
            }
        }
        System.out.println("The Student with Highest Average Marks " + high.name);
        sc.close();
    }
}
