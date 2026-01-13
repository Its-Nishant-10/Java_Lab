
/*
 * Create an Employee class and sort employees by salary without using built-in
 * sorting methods.
 */

import java.util.Scanner;

class Employee {
    int emp_id;
    float salary;

    public static void main(String args[]) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Employees: ");
        int n = sc.nextInt();
        Employee[] e = new Employee[n];
        for (int i = 0; i < e.length; i++) {
            e[i] = new Employee();
            System.out.print("Enter Employee ID: ");
            e[i].emp_id = sc.nextInt();
            System.out.print("Enter Salary: ");
            e[i].salary = sc.nextFloat();
        }
        for (int i = 0; i < e.length - 1; i++) {
            for (int j = 0; j < e.length - i - 1; j++) {
                if (e[j].salary > e[j + 1].salary) {
                    Employee temp = e[j];
                    e[j] = e[j + 1];
                    e[j + 1] = temp;
                }
            }
        }
        System.out.println("The Sorted List");
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i].emp_id + " -- " + e[i].salary);
        }
        sc.close();
    }
}
