interface pp1 {
    void show();
}

interface cc1 extends pp1 {
    void display();
}

class tt1 implements cc1 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        tt1 t = new tt1();
        t.show();
        t.display();
    }

    public void show() {
        System.out.println("Show");
    }

    public void display() {
        System.out.println("Display");
    }
}
