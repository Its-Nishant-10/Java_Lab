
/* Create a Customer class and search customer by email ID. */

import java.util.Scanner;

class Customer {
    String name;
    String email;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Customer[] c = new Customer[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name and email");
            c[i] = new Customer();
            c[i].name = sc.next();
            c[i].email = sc.next();
        }
        System.out.println("Enter the Email to be searched");
        String Email = sc.next();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (c[i].email.equals(Email)) {
                System.out.println(c[i].name + " " + c[i].email);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Customer not found");
        }
        sc.close();
    }
}
