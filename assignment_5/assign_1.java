/*
 * Write a Java program where a child class calls a parameterized parent
 * constructor using super().
 */
class A_1 {
    A_1(int x) {
        System.out.println(x);
    }
}

class B_10 extends A_1 {
    B_10(int x) {
        super(x);
    }

    static void main(String[] args) {
        System.out.println("Nishant Nahar - 2415551078");
        new B_10(5);
    }
}
