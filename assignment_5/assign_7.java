class A_31 {
    A_31() {
        System.out.println("A");
    }
}

class B_11 extends A_31 {
    B_11() {
        super();
        System.out.println("B");
    }
}

class C_01 extends B_11 {
    C_01() {
        super();
        System.out.println("C");
    }

    static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        new C_01();
    }
}