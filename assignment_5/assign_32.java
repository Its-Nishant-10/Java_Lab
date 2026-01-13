class bind_1 {
    void show() {
        System.out.println("1");
    }
}

class bind_2 extends bind_1 {
    void show() {
        System.out.println("2");
    }

    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        bind_1 obj = new bind_2();
        obj.show();
    }
}
