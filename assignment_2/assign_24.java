
/*
 * Create a class Box with (height, width, depth) and compute volume.
 * Create two objects and compare which box has larger volume.
 */

import java.util.Scanner;

class Box_1 {
    double height, width, depth;

    public static void main(String args[]) {
        System.out.println("Nishant Nahar -- 241551078");
        Scanner sc = new Scanner(System.in);

        Box_1 b1 = new Box_1();
        Box_1 b2 = new Box_1();

        System.out.println("Enter dimensions for Box_1 1:");
        b1.inputDimensions(sc);
        System.out.println("Enter dimensions for Box_1 2:");
        b2.inputDimensions(sc);

        System.out.println("\nBox_1 1 details:");
        b1.display();
        System.out.println("\nBox_1 2 details:");
        b2.display();

        if (b1.volume() > b2.volume()) {
            System.out.println("\nBox_1 1 has larger volume.");
        } else if (b2.volume() > b1.volume()) {
            System.out.println("\nBox_1_1 2 has larger volume.");
        } else {
            System.out.println("\nBoth boxes have equal volume.");
        }

        sc.close();
    }

    void inputDimensions(Scanner sc) {
        System.out.print("Enter height: ");
        height = sc.nextDouble();
        System.out.print("Enter width: ");
        width = sc.nextDouble();
        System.out.print("Enter depth: ");
        depth = sc.nextDouble();
    }

    double volume() {
        return height * width * depth;
    }

    void display() {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Depth: " + depth);
        System.out.println("Volume: " + volume());
    }
}