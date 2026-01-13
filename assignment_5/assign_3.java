/*
 * Override a method in a child class and invoke the parent version using
 * super.method()
 */
class par {
    void show() {
        System.out.println("A");
    }
}

class chi extends par {
    static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        new chi().show();
    }

    void show() {
        super.show();
        System.out.println("B");
    }
}
