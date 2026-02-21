class Q22 {
    static void first() {
        int a = 10 / 0;
        System.out.println(a);
    }

    static void second() {
        first();
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        second();
    }
}
