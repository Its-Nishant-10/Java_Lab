abstract class A7 {
    abstract void f();
}

class T7 extends A7 {
    void f() {
        System.out.println("run");
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        A7 r = new T7();
        r.f();
    }
}
