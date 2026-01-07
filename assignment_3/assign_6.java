
/*
 * Create a Product class and detect duplicate product IDs using array of
 * objects
 */
import java.util.*;

class Prod_1 {
    int product_Id;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        Prod_1[] p = new Prod_1[n];

        for (int i = 0; i < n; i++) {
            p[i] = new Prod_1();
            System.out.print("Enter Product ID: ");
            if (sc.hasNextInt()) {
                p[i].product_Id = sc.nextInt();
            }
        }

        boolean Dup = false;
        for (int i = 0; i < p.length; i++) {
            for (int j = i + 1; j < p.length; j++) {
                if (p[i].product_Id == p[j].product_Id) {
                    System.out.println("Duplicate Product ID found: " + p[i].product_Id);
                    Dup = true;
                    break;
                }
            }
        }

        if (!Dup) {
            System.out.println("No duplicate Product IDs found");
        }

        sc.close();
    }
}