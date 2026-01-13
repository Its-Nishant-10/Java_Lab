/*
 * Demonstrate constructor chaining using multiple constructors in the same
 * class
 */
class Chaining {
    Chaining() {
        this(90);
        System.out.println("Hello Guys");
    }

    Chaining(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        new Chaining();
    }
}