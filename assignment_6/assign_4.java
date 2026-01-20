abstract class Gaddi {
    abstract void mv();

    void ff() {
        System.out.println("Hello");
    }
}

class bmw extends Gaddi {
    void mv() {
        System.out.println("bmw");
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        Gaddi g = new bmw();
        g.mv();
        g.ff();
    }
}
