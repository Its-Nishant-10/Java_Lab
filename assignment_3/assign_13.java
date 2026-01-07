
/* Create a Student class and compute class average, highest and lowest marks */
import java.util.*;

class Stud_2 {
    int rollNo;
    int marks;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int n = sc.nextInt();
        if (n <= 0) {
            sc.close();
            return;
        }

        Stud_2[] s = new Stud_2[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter roll number and marks");
            s[i] = new Stud_2();
            s[i].rollNo = sc.nextInt();
            s[i].marks = sc.nextInt();
        }

        int total = 0;
        int highest = s[0].marks;
        int lowest = s[0].marks;

        for (int i = 0; i < n; i++) {
            total = total + s[i].marks;
            if (s[i].marks > highest) {
                highest = s[i].marks;
            }
            if (s[i].marks < lowest) {
                lowest = s[i].marks;
            }
        }

        double average = (double) total / n;
        System.out.println("Class Average: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
}