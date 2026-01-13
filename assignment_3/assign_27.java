/**
 * Create a Library class and implement search, issue, and return using array of
 * objects
 */

import java.util.Scanner;

class Library {
    String bookName;
    boolean issued;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Library[] lib = new Library[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter book name");
            lib[i] = new Library();
            lib[i].bookName = sc.next();
            lib[i].issued = false;
        }

        while (true) {
            System.out.println("1.Search 2.Issue 3.Return 4.Exit");
            int choice = sc.nextInt();
            if (choice == 4)
                break;

            System.out.println("Enter book name");
            String name = sc.next();

            if (choice == 1) {
                searchBook(lib, name);
            } else if (choice == 2) {
                issueBook(lib, name);
            } else if (choice == 3) {
                returnBook(lib, name);
            }
        }
        sc.close();
    }

    static void searchBook(Library[] lib, String name) {
        boolean found = false;
        for (int i = 0; i < lib.length; i++) {
            if (lib[i].bookName.equals(name)) {
                System.out.println("Book found: " + lib[i].bookName + ", Issued: " + lib[i].issued);
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Book not found");
    }

    static void issueBook(Library[] lib, String name) {
        boolean found = false;
        for (int i = 0; i < lib.length; i++) {
            if (lib[i].bookName.equals(name)) {
                if (!lib[i].issued) {
                    lib[i].issued = true;
                    System.out.println("Book issued: " + lib[i].bookName);
                } else {
                    System.out.println("Book already issued");
                }
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Book not found");
    }

    static void returnBook(Library[] lib, String name) {
        boolean found = false;
        for (int i = 0; i < lib.length; i++) {
            if (lib[i].bookName.equals(name)) {
                if (lib[i].issued) {
                    lib[i].issued = false;
                    System.out.println("Book returned: " + lib[i].bookName);
                } else {
                    System.out.println("Book was not issued");
                }
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Book not found");
    }
}
