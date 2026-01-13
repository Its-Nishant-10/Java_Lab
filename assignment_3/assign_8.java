
/* Create a Student class and remove a student object based on roll number */

import java.util.Scanner;

class student_3 {
    int rollNo;
    String name;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int n = sc.nextInt();
        student_3[] s = new student_3[n];
        for (int i = 0; i < n; i++) {
            s[i] = new student_3();
            System.out.println("Enter the RollNo and Name");
            s[i].rollNo = sc.nextInt();
            s[i].name = sc.next();
        }

        System.out.println("Enter roll number to remove:");
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int remove_roll = sc.nextInt();

        student_3[] s1 = new student_3[n - 1];
        int j = 0;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (s[i].rollNo == remove_roll && !found) {
                found = true;
                continue;
            }
            if (j < s1.length) {
                s1[j] = s[i];
                j++;
            }
        }

        if (found) {
            System.out.println("Remaining student_3s:");
            for (int i = 0; i < j; i++) {
                System.out.println(s1[i].rollNo + " " + s1[i].name);
            }
        } else {
            System.out.println("student_3 not found");
        }

        sc.close();
    }
}