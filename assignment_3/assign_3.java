/*
 * Create a Bank_Account class and find total balance of all savings accounts
 * only
 */

import java.util.Scanner;

class Bank_Account {
    double balance;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNext()) {
            sc.close();
            return;
        }

        System.out.print("Enter choice (a - Savings, b - Other): ");
        char choice = sc.next().charAt(0);

        System.out.print("Enter number of accounts: ");
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();

        Bank_Account[] b = new Bank_Account[n];
        for (int i = 0; i < n; i++) {
            b[i] = new Bank_Account();
            System.out.print("Enter balance for account " + (i + 1) + ": ");
            if (sc.hasNextDouble()) {
                b[i].balance = sc.nextDouble();
            }
        }

        if (choice == 'a') {
            double total = 0;
            System.out.println("Balances:");
            for (int i = 0; i < n; i++) {
                System.out.println(b[i].balance);
                total = total + b[i].balance;
            }
            System.out.println("Total = " + total);
        }

        sc.close();
    }
}