class d_par {
    void show() {
        System.out.println("1");
    }
}

class d_chi extends d_par {
    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        d_par obj = new d_chi();
        obj.show();
    }

    void show() {
        System.out.println("2");
    }
}
