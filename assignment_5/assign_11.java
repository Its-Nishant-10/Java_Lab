class one {
    final int x = 10;
}

class two extends one {
    public static void main(String[] a) {
        two t = new two();
        t.show();
    }

    void show() {
        // x = 20;
    }
}
