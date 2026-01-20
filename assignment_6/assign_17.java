interface myia {
    default void helo() {
        System.out.println("Hello");
    }

    static void msgg() {
        System.out.println("Static Method");
    }
}

class deda implements myia {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        deda d = new deda();
        d.helo();
        myia.msgg();
    }
}
