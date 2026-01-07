
/* Create a BankAccount class and remove all zero-balance accounts */
import java.util.*;

class BankAccount {
    String name;
    double balance;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BankAccount[] a = new BankAccount[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter account holder name and balance");
            a[i] = new BankAccount();
            a[i].name = sc.next();
            a[i].balance = sc.nextDouble();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i].balance != 0) {
                count++;
            }
        }

        BankAccount[] nonZero = new BankAccount[count];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i].balance != 0) {
                nonZero[j++] = a[i];
            }
        }

        System.out.println("Accounts with non-zero balance:");
        for (int i = 0; i < nonZero.length; i++) {
            System.out.println(nonZero[i].name + " " + nonZero[i].balance);
        }
        sc.close();
    }
}

