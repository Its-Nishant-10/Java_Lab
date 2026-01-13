
/* Create a Mobile class and count mobiles in different price ranges */

import java.util.Scanner;

class Mobile {
    String brand;
    int price;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Mobile[] m = new Mobile[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter mobile brand and price");
            m[i] = new Mobile();
            m[i].brand = sc.next();
            m[i].price = sc.nextInt();
        }
        int count_25 = 0;
        int count_50 = 0;
        int count_75 = 0;
        int count_abv_75 = 0;
        for (int i = 0; i < n; i++) {
            if (m[i].price <= 25000) {
                count_25++;
            } else if (m[i].price <= 50000) {
                count_50++;
            } else if (m[i].price <= 75000) {
                count_75++;
            } else {
                count_abv_75++;
            }
        }
        System.out.println("Mobiles in price 0-25000: " + count_25);
        System.out.println("Mobiles in price 25001-50000: " + count_50);
        System.out.println("Mobiles in price 50001-75000: " + count_75);
        System.out.println("Mobiles in price 75001 and above: " + count_abv_75);
        sc.close();
    }
}
