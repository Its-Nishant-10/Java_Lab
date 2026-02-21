class s_f_p {
    int x = 10;

    final void show() {
        System.out.println("1");
    }
}

class s_f_c extends s_f_p {
    int x = 20;

    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        s_f_p obj = new s_f_c();
        ((s_f_c) obj).display();
    }

    void display() {
        System.out.println(super.x);
        super.show();
    }
}
