
/* Create an Item class and find most expensive item using object comparison */

import java.util.Scanner;

class Item {
    String name;
    double price;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Item[] it = new Item[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter item name and price");
            it[i] = new Item();
            it[i].name = sc.next();
            it[i].price = sc.nextDouble();
        }

        Item max = it[0];
        for (int i = 1; i < n; i++) {
            if (it[i].price > max.price) {
                max = it[i];
            }
        }

        System.out.println("Most Expensive Item: " + max.name + " " + max.price);
        sc.close();
    }
}

