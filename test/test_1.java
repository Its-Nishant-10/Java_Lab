import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int m1, m2, m3;

    double percentage() {
        return ((m1 + m2 + m3) / 300.0) * 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nishant Nahar -- 241551078");
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            System.out.println("Enter details of student " + (i + 1));
            System.out.print("Enter roll number: ");
            s[i].rollNo = sc.nextInt();
            System.out.print("Enter name: ");
            s[i].name = sc.next();
            System.out.print("Enter marks of 3 subjects: ");
            s[i].m1 = sc.nextInt();
            s[i].m2 = sc.nextInt();
            s[i].m3 = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (s[j].percentage() > s[j + 1].percentage()) {
                    Student temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }

        int A = 0, B = 0, C = 0, F = 0;
        for (int i = 0; i < n; i++) {
            char grade;
            double p = s[i].percentage();
            if (p >= 75) {
                grade = 'A';
                A++;
            } else if (p >= 60) {
                grade = 'B';
                B++;
            } else if (p >= 40) {
                grade = 'C';
                C++;
            } else {
                grade = 'F';
                F++;
            }
            System.out.println(s[i].rollNo + " " + s[i].name + " " + p + " " + grade);
        }

        Student top = s[n - 1];
        System.out.println("Topper: " + top.name + " Roll No: " + top.rollNo);
        System.out.println("Grade A: " + A);
        System.out.println("Grade B: " + B);
        System.out.println("Grade C: " + C);
        System.out.println("Grade F: " + F);

        sc.close();
    }
}