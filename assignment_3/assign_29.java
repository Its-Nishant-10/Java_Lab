
/*
 * Create an Employee class and find employees with same salary but different
 * roles
 */

import java.util.Scanner;

class employ_0 {
    String name;
    String role;
    int salary;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int n = sc.nextInt();
        employ_0[] e = new employ_0[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter employee name, role and salary");
            e[i] = new employ_0();
            e[i].name = sc.next();
            e[i].role = sc.next();
            e[i].salary = sc.nextInt();
        }

        System.out.println("Employees with same salary but different roles:");
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (e[i].salary == e[j].salary && !e[i].role.equals(e[j].role)) {
                    System.out.println(e[i].name + " (" + e[i].role + ") and " + e[j].name + " (" + e[j].role
                            + ") - Salary: " + e[i].salary);
                }
            }
        }
        sc.close();
    }
}
