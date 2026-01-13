class a_a {
    void show() {
        System.out.println("1");
    }
}

class a_b extends a_a {
    void show() {
        System.out.println("2");
    }
}

class a_c extends a_b {
    void show() {
        System.out.println("3");
    }

    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        a_a obj = new a_c();
        obj.show();
    }
}
