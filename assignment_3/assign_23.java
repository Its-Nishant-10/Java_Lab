
/* Create a Hotel class and find highest-rated hotel city-wise */
import java.util.*;

class Hotel {
    String name;
    String city;
    double rating;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Hotel[] h = new Hotel[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter hotel name, city, and rating");
            h[i] = new Hotel();
            h[i].name = sc.next();
            h[i].city = sc.next();
            h[i].rating = sc.nextDouble();
        }

        String[] cities = new String[n];
        int cityCount = 0;

        for (int i = 0; i < n; i++) {
            boolean exists = false;
            for (int j = 0; j < cityCount; j++) {
                if (cities[j].equals(h[i].city)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                cities[cityCount++] = h[i].city;
            }
        }

        for (int i = 0; i < cityCount; i++) {
            int idx = -1;
            for (int j = 0; j < n; j++) {
                if (h[j].city.equals(cities[i])) {
                    if (idx == -1 || h[j].rating > h[idx].rating) {
                        idx = j;
                    }
                }
            }
            System.out.println("City: " + cities[i] + ", Highest Rated Hotel: " + h[idx].name + " " + h[idx].rating);
        }
        sc.close();
    }
}

