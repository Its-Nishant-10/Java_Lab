
/* Create a Student class and rank students based on total marks */
import java.util.*;

class student_4 {
    String name;
    int marks;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int n = sc.nextInt();
        student_4[] s = new student_4[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter student name and marks");
            s[i] = new student_4();
            s[i].name = sc.next();
            s[i].marks = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s[i].marks < s[j].marks) {
                    student_4 temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }

        System.out.println("Ranked Students:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + s[i].name + " " + s[i].marks);
        }
        sc.close();
    }
}
