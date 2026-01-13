class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println(x);
        System.out.println(super.x);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        new Child().show();
    }
}
