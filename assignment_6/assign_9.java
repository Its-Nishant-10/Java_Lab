interface inti {
    void f();
}

abstract class W implements inti {
    abstract void g();
}

class X extends W {
    public void f() {
        System.out.println("f");
    }
    void g() {
        System.out.println("g");
    }
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        X x = new X();
        x.f();
        x.g();
    }
}
