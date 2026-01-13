
/* Create an Employee class and update salary based on years of experience */

import java.util.Scanner;

class employ_1 {
    String name;
    int salary;
    int exp;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        employ_1[] e = new employ_1[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter employee name, salary and experience");
            e[i] = new employ_1();
            e[i].name = sc.next();
            e[i].salary = sc.nextInt();
            e[i].exp = sc.nextInt();
        }
        System.out.println("Enter the increment");
        int incr = sc.nextInt();
        for (int i = 0; i < n; i++) {
            e[i].salary += e[i].exp * incr;
        }

        System.out.println("Updated Employee Salaries:");
        for (int i = 0; i < n; i++) {
            System.out.println(e[i].name + " " + e[i].salary);
        }
        sc.close();
    }
}
