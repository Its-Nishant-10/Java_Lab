/* Show that super() must be the first statement in a constructor. */
class A_0 {
    A_0() {
        System.out.println("A");
    }
}

class assign_4 extends A_0 {
    assign_4() {
        System.out.println("B");
        super();
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        new assign_4();
    }
}
