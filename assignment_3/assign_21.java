
/* Create a Book class and merge two arrays of books without duplicates */

import java.util.Scanner;

class Book_0 {
    String name;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        Book_0[] b1 = new Book_0[n1];
        for (int i = 0; i < n1; i++) {
            System.out.println("Enter book name for array 1");
            b1[i] = new Book_0();
            b1[i].name = sc.next();
        }

        int n2 = sc.nextInt();
        Book_0[] b2 = new Book_0[n2];
        for (int i = 0; i < n2; i++) {
            System.out.println("Enter book name for array 2");
            b2[i] = new Book_0();
            b2[i].name = sc.next();
        }

        Book_0[] merged = new Book_0[n1 + n2];
        int m = 0;

        for (int i = 0; i < n1; i++) {
            merged[m++] = b1[i];
        }

        for (int i = 0; i < n2; i++) {
            boolean exists = false;
            for (int j = 0; j < m; j++) {
                if (b2[i].name.equals(merged[j].name)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                merged[m++] = b2[i];
            }
        }

        System.out.println("Merged books without duplicates:");
        for (int i = 0; i < m; i++) {
            System.out.println(merged[i].name);
        }
        sc.close();
    }
}

