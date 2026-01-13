
/* Create a Rectangle class and find the rectangle with maximum area. */

import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rectangles: ");
        int n = sc.nextInt();
        Rectangle[] r = new Rectangle[n];
        for (int i = 0; i < r.length; i++) {
            r[i] = new Rectangle();
            System.out.print("Enter length: ");
            r[i].length = sc.nextInt();
            System.out.print("Enter breadth: ");
            r[i].breadth = sc.nextInt();
        }
        int maxArea = r[0].area();
        int loc = 0;
        for (int i = 1; i < r.length; i++) {
            if (r[i].area() > maxArea) {
                maxArea = r[i].area();
                loc = i;
            }
        }
        System.out.println("Rectangle - maximum area:");
        System.out.println("Length = " + r[loc].length);
        System.out.println("Breadth = " + r[loc].breadth);
        System.out.println("Area = " + maxArea);
        sc.close();
    }

    int area() {
        return length * breadth;
    }
}

