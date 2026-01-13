class cons_final {
    int x;

    cons_final(final int x) {
        this.x = x;
    }
}

class cons_final_1 {
    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        cons_final c = new cons_final(10);
        System.out.println(c.x);
    }
}
