class A {
    final int x;

    static {
        System.out.println("A: static block");
    }

    {
        System.out.println("A: instance initializer");
        x = 100;
    }

    A(int x) {
        System.out.println("A: constructor, param x = " + x);
    }

    final void show() {
        System.out.println("A: final show(), x = " + x);
    }

    void display() {
        System.out.println("A: display()");
    }
}

class B extends A {
    int x = 200;

    static {
        System.out.println("B: static block");
    }

    {
        System.out.println("B: instance initializer");
    }

    B() {
        super(10);
        System.out.println("B: constructor");
    }

    void display() {
        System.out.println("B: display(), x = " + x + ", super.x = " + super.x);
    }
}

class C extends B {
    static {
        System.out.println("C: static block");
    }

    {
        System.out.println("C: instance initializer");
    }

    C() {
        System.out.println("C: constructor");
    }

    void display() {
        System.out.println("C: display()");
    }
}

public class test_3 {
    public static void main(String[] args) {
        A ref = new C();
        ref.display();
        ref.show();
    }
}