
/* Create a Book class and display books published after a given year */

import java.util.Scanner;

class Books {
    String book_name;
    int year;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books");
        int n = sc.nextInt();
        Books b[] = new Books[n];
        for (int i = 0; i < b.length; i++) {
            b[i] = new Books();
            System.out.println("Book Name - ");
            b[i].book_name = sc.next();
            System.out.println("Year of Publishing");
            b[i].year = sc.nextInt();
        }
        System.out.println("Enter the Year u want from");
        int y = sc.nextInt();
        for (int i = 0; i < b.length; i++) {
            if (b[i].year >= y) {

                System.out.println(b[i].book_name + " " + b[i].year);
            }
        }
        sc.close();
    }
}
