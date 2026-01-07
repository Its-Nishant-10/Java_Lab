
/* Create a Student class and separate pass and fail students */
import java.util.*;

class Stud_7 {
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
        Stud_7[] s = new Stud_7[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student name and marks");
            s[i] = new Stud_7();
            s[i].name = sc.next();
            s[i].marks = sc.nextInt();
        }

        System.out.println("Pass Students:");
        for (int i = 0; i < n; i++) {
            if (s[i].marks >= 40) {
                System.out.println(s[i].name + " " + s[i].marks);
            }
        }

        System.out.println("Fail Students:");
        for (int i = 0; i < n; i++) {
            if (s[i].marks < 40) {
                System.out.println(s[i].name + " " + s[i].marks);
            }
        }

        sc.close();
    }
}
