class Q23 {
    static void first() {
        int a = 10 / 0;
    }

    static void second() {
        try {
            first();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in second()");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        second();
    }
}
