
/* Create a Product class and apply discount to products above a given price. */
import java.util.*;

class Product {
    String name;
    double price;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product[] p = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter product name and price");
            p[i] = new Product();
            p[i].name = sc.next();
            p[i].price = sc.nextDouble();
        }
        double limit = sc.nextDouble();
        double discount = sc.nextDouble();
        for (int i = 0; i < n; i++) {
            if (p[i].price > limit) {
                p[i].price = p[i].price - (p[i].price * discount / 100);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(p[i].name + " " + p[i].price);
        }
        sc.close();
    }
}

