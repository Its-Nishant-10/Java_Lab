abstract class Animal {
    abstract void so();

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        Animal a = new Dog();
        a.so();
        a.eat();
    }

    void so() {
        System.out.println("Bark");
    }
}
