interface Ia {
    void m1();
}

abstract class Ib {
    abstract void m2();
}

class a19 extends Ib implements Ia {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        a19 t = new a19();
        t.m1();
        t.m2();
    }

    public void m1() {
        System.out.println("Interface");
    }

    public void m2() {
        System.out.println("Abstract");
    }
}
