/* Demonstrate accessing a hidden parent class variable using super. */
class A_2 {
    int x = 10;
}

class B_2 extends A_2 {
    int x = 20;

    static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        B_2 b = new B_2();
        System.out.println(b.x);
        b.show();
    }

    void show() {
        System.out.println(super.x);
    }
}
