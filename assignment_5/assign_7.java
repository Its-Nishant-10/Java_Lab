class A_3 {
    A_3() {
        System.out.println("A");
    }
}

class B_1 extends A_3 {
    B_1() {
        super();
        System.out.println("B");
    }
}

class C_0 extends B_1 {
    C_0() {
        super();
        System.out.println("C");
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        new C_0();
    }
}