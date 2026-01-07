
/* Create a Hotel class and sort hotels by rating and then by price. */
import java.util.*;

class Hotel_1 {
    String name;
    double rating;
    double price;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int n = sc.nextInt();
        Hotel_1[] h = new Hotel_1[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter hotel name, rating and price");
            h[i] = new Hotel_1();
            h[i].name = sc.next();
            h[i].rating = sc.nextDouble();
            h[i].price = sc.nextDouble();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (h[i].rating < h[j].rating) {
                    Hotel_1 temp = h[i];
                    h[i] = h[j];
                    h[j] = temp;
                }
            }
        }

        System.out.println("Hotels sorted by rating (descending):");
        for (int i = 0; i < n; i++) {
            System.out.println(h[i].name + " Rating: " + h[i].rating + " Price: " + h[i].price);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (h[i].price > h[j].price) {
                    Hotel_1 temp = h[i];
                    h[i] = h[j];
                    h[j] = temp;
                }
            }
        }

        System.out.println("Hotels sorted by price (ascending):");
        for (int i = 0; i < n; i++) {
            System.out.println(h[i].name + " Rating: " + h[i].rating + " Price: " + h[i].price);
        }

        sc.close();
    }
}