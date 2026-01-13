/*
 * Write a program to show constructor overloading using a Box class (cube and
 * cuboid)
 */
class Box_2 {
    int area;

    Box_2(int a) {
        area = a * a;
    }

    Box_2(int l, int b) {
        area = l * b;
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar : 241551078");
        Box_2 cube = new Box_2(3);
        Box_2 cuboid = new Box_2(2, 8);
        System.out.println("The area of cube is " + cube.area);
        System.out.println("The area of cuboid is " + cuboid.area);
    }
}