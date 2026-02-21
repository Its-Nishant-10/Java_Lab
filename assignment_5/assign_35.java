class exc_p {
    void show() throws Exception {
        System.out.println("1");
    }
}

class exc_c extends exc_p {
    public static void main(String[] a) throws Exception {
        System.out.println("Nishant Nahar - 241551078");
        exc_p obj = new exc_c();
        obj.show();
    }

    void show() {
        System.out.println("2");
    }
}
