
/*
 * Create a Laptop class and find the laptop with minimum price and maximum RAM
 */
import java.util.*;

class Laptop {
    String brand;
    int ram;
    int price;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Laptop[] l = new Laptop[n];
        for (int i = 0; i < n; i++) {
            l[i] = new Laptop();
            System.out.print("Enter Laptop Brand, Ram and Price");
            l[i].brand = sc.next();
            l[i].ram = sc.nextInt();
            l[i].price = sc.nextInt();
        }
        int minPrice = 0;
        int maxRam = 0;
        for (int i = 1; i < n; i++) {
            if (l[i].price < l[minPrice].price) {
                minPrice = i;
            }
            if (l[i].ram > l[maxRam].ram) {
                maxRam = i;
            }
        }
        System.out.println(l[minPrice].brand + " " + l[minPrice].ram + " " + l[minPrice].price);
        System.out.println(l[maxRam].brand + " " + l[maxRam].ram + " " + l[maxRam].price);
        sc.close();
    }
}

