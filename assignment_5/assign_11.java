class one {
    final int x = 10;
}

class two extends one {
    void show() {
        // x = 20;
    }

    public static void main(String[] a) {
        two t = new two();
        t.show();
    }
}
