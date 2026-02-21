class me_1 {
    void show() {
        System.out.println("1");
    }
}

class me_2 extends me_1 {
    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        me_1 obj = new me_2(); // runtime polymorphism
        obj.show();
    }

    void show() {
        System.out.println("2");
    }
}
