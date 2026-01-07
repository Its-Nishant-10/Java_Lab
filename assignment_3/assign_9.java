
/* Create a Movie class and display movies with rating greater than 8.5 */
import java.util.*;

class Movie {
    String name;
    double rating;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Movie[] m = new Movie[n];

        for (int i = 0; i < n; i++) {
            m[i] = new Movie();
            System.out.println("Movie Name and Rating");
            m[i].name = sc.next();
            m[i].rating = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            if (m[i].rating > 8.5) {
                System.out.println(m[i].name + " " + m[i].rating);
            }
        }
        sc.close();
    }
}
