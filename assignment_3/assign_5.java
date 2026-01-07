
/* Create a Car class and count cars of a specific brand */
import java.util.*;

class Cars {
    String brand;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cars: ");
        int n = sc.nextInt();
        Cars[] c = new Cars[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter brand for car " + (i + 1));
            c[i] = new Cars();
            c[i].brand = sc.next();
        }
        System.out.println("Enter the brand you want to search");
        String b = sc.next();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (b.equals(c[i].brand)) {
                count++;
            }
        }
        System.out.println("The Car Brand " + b + " appeared " + count + " times");
        sc.close();
    }
}

