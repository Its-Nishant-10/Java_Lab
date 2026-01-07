
/* Create a Vehicle class and separate two-wheelers and four-wheelers */
import java.util.*;

class Vehicle {
    String name;
    int wheels;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vehicle[] v = new Vehicle[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter vehicle name and number of wheels");
            v[i] = new Vehicle();
            v[i].name = sc.next();
            v[i].wheels = sc.nextInt();
        }
        System.out.println("Two-wheelers:");
        for (int i = 0; i < n; i++) {
            if (v[i].wheels == 2) {
                System.out.println(v[i].name);
            }
        }
        System.out.println("Four-wheelers:");
        for (int i = 0; i < n; i++) {
            if (v[i].wheels == 4) {
                System.out.println(v[i].name);
            }
        }
        sc.close();
    }
}

