/* Write a program showing difference between inheritance and aggregation. */
class Base {
    void run() {
        System.out.println("Running");
    }
}

class Inh extends Base {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        new Inh().run();
        new Agg().b.run();
    }
}

class Agg {
    Base b = new Base();
}