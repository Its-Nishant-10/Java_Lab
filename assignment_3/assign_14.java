
/* Create a Train class and display trains between source and destination */

import java.util.Scanner;

class Train {
    String name;
    String source;
    String destination;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Train[] t = new Train[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter train name, source, and destination");
            t[i] = new Train();
            t[i].name = sc.next();
            t[i].source = sc.next();
            t[i].destination = sc.next();
        }
        System.out.println("Enter Source and Destination");
        String Source = sc.next();
        String Destination = sc.next();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (t[i].source.equals(Source) && t[i].destination.equals(Destination)) {
                System.out.println(t[i].name + " " + t[i].source + " " + t[i].destination);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No trains found between " + Source + " and " + Destination);
        }
        sc.close();
    }
}
