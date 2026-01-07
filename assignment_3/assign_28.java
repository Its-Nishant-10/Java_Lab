
/* Create a Student class and assign grades (A/B/C/F) based on marks */
import java.util.*;

class stud_4 {
    String name;
    int marks;
    char grade;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        stud_4[] s = new stud_4[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student name and marks");
            s[i] = new stud_4();
            s[i].name = sc.next();
            s[i].marks = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (s[i].marks >= 80) {
                s[i].grade = 'A';
            } else if (s[i].marks >= 60) {
                s[i].grade = 'B';
            } else if (s[i].marks >= 40) {
                s[i].grade = 'C';
            } else {
                s[i].grade = 'F';
            }
        }

        System.out.println("Student Grades:");
        for (int i = 0; i < n; i++) {
            System.out.println(s[i].name + " " + s[i].marks + " " + s[i].grade);
        }
        sc.close();
    }
}
