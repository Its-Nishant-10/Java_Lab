class up_1 {
    void show() {
        System.out.println("1");
    }
}

class up_2 extends up_1 {
    void show() {
        System.out.println("2");
    }

    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        up_1 obj = new up_2(); // upcasting
        obj.show();
    }
}
