class A_00 {
    static {
        System.out.println("A: static block");
    }

    final int x;

    {
        System.out.println("A: instance initializer");
        x = 100;
    }

    A_00(int x) {
        System.out.println("A: constructor, param x = " + x);
    }

    final void show() {
        System.out.println("A: final show(), x = " + x);
    }

    void display() {
        System.out.println("A: display()");
    }
}

class B_00 extends A_00 {
    static {
        System.out.println("B: static block");
    }

    int x = 200;

    {
        System.out.println("B: instance initializer");
    }

    B_00() {
        super(10);
        System.out.println("B: constructor");
    }

    void display() {
        System.out.println("B: display(), x = " + x + ", super.x = " + super.x);
    }
}

class C_00 extends B_00 {
    static {
        System.out.println("C: static block");
    }

    {
        System.out.println("C: instance initializer");
    }

    C_00() {
        System.out.println("C: constructor");
    }

    void display() {
        System.out.println("C: display()");
    }
}

public class test_3 {
    static void main(String[] args) {
        A_00 ref = new C_00();
        ref.display();
        ref.show();
    }
}