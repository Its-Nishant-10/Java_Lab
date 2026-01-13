/*
 * Write a program to show the difference between constructor and method using
 * execution order
 */
class Diff {
    Diff() {
        System.out.println("It is a constructor");
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        Diff d = new Diff();
        d.meth();
    }

    void meth() {
        System.out.println("It is a method");
    }
}