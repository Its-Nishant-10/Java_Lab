/*
 * Write a program to show incorrect behavior without using this and correct it
 */
class C {
    int v;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        C o = new C();
        o.bad(10);
        o.good(20);
    }

    void bad(int v) {
        // v = v;
        System.out.println("Inside bad (shadowing): " + v);
    }

    void good(int v) {
        this.v = v;
        System.out.println("Inside good (using this):" + this.v);
    }
}