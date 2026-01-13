class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        new Child().show();
    }

    void show() {
        System.out.println(x);
        System.out.println(super.x);
    }
}
