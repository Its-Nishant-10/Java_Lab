class beh {
    int x;

    beh(int x) {
        this.x = x;
    }
}

class beh_1 {
    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        final beh r = new beh(10);
        r.x = 20;
        System.out.println(r.x);
        // r = new beh(30); // Not allowed, final reference cannot point to new object
    }
}
