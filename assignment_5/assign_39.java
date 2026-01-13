class s_f_p {
    final void show() {
        System.out.println("1");
    }

    int x = 10;
}

class s_f_c extends s_f_p {
    int x = 20;

    void display() {
        System.out.println(super.x);
        super.show();
    }

    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        s_f_p obj = new s_f_c();
        ((s_f_c) obj).display();
    }
}
