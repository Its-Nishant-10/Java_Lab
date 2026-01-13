/* Show that super() must be the first statement in a constructor. */
class A_0 {
    A_0() {
        System.out.println("A");
    }
}

class B_0 extends A_0 {
    B_0() {
        System.out.println("B");
        super();
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        new B_0();
    }
}
