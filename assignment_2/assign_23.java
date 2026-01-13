
/*
 * Create a class Account with accountNo, name, balance.
 * Write functions to deposit, withdraw, and display balance
 */

import java.util.Scanner;

class Account {
    int accountNo;
    String name;
    double balance;

    public static void main(String args[]) {
        System.out.println("Nishant Nahar -- 241551078");
        Account a = new Account();
        a.inputDetails();
        a.deposit(500);
        a.withdraw(200);
        a.deposit(1000);
        a.withdraw(1);
        a.displayBalance();
    }

    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        accountNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter initial balance: ");
        balance = sc.nextDouble();
        sc.close();
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}
