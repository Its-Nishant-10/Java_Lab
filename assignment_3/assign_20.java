
/* Create an Employee class and find department-wise highest paid employee */
import java.util.*;

class employ {
    String name;
    String dept;
    int salary;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int n = sc.nextInt();
        employ[] e = new employ[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter employee name, department, and salary");
            e[i] = new employ();
            e[i].name = sc.next();
            e[i].dept = sc.next();
            e[i].salary = sc.nextInt();
        }

        String[] depts = new String[n];
        int deptCount = 0;

        for (int i = 0; i < n; i++) {
            boolean exists = false;
            for (int j = 0; j < deptCount; j++) {
                if (depts[j].equals(e[i].dept)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                depts[deptCount] = e[i].dept;
                deptCount++;
            }
        }

        for (int i = 0; i < deptCount; i++) {
            int idx = -1;
            for (int j = 0; j < n; j++) {
                if (e[j].dept.equals(depts[i])) {
                    if (idx == -1 || e[j].salary > e[idx].salary) {
                        idx = j;
                    }
                }
            }
            if (idx != -1) {
                System.out
                        .println("Department: " + depts[i] + ", Highest Paid: " + e[idx].name + " & " + e[idx].salary);
            }
        }
        sc.close();
    }
}