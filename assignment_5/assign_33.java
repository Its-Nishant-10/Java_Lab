class imp_p {
    void show() {
        System.out.println("1");
    }
}

class imp_c extends imp_p {
    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        imp_p p1 = new imp_p();
        imp_p p2 = new imp_c();
        p1.show();
        p2.show();
    }

    void show() {
        System.out.println("2");
    }
}
