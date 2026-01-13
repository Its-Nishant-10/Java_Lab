
/*
 * Create a class Rec with length & breadth.
 * Write methods to compute area, perimeter and display them
 */

import java.util.Scanner;

class Rec {
    double length, breadth;

    public static void main(String args[]) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);

        Rec r = new Rec();
        r.inputDimensions(sc);
        r.display();

        sc.close();
    }

    void inputDimensions(Scanner sc) {
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }

    void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}