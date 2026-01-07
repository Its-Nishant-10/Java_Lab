
/* Create a Person class and find the oldest and youngest person. */
import java.util.*;

class people {
    String name;
    int age;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        people[] p = new people[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name and age");
            p[i] = new people();
            p[i].name = sc.next();
            p[i].age = sc.nextInt();
        }
        int old = 0;
        int young = 0;
        for (int i = 1; i < n; i++) {
            if (p[i].age > p[old].age) {
                old = i;
            }
            if (p[i].age < p[young].age) {
                young = i;
            }
        }
        System.out.println(p[old].name + " " + p[old].age);
        System.out.println(p[young].name + " " + p[young].age);
        sc.close();
    }
}
