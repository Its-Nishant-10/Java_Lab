interface ina {
    void hello();
}

interface inb {
    void bye();
}

class MyClass implements ina, inb {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        MyClass obj = new MyClass();
        obj.hello();
        obj.bye();
    }

    public void hello() {
        System.out.println("Hello");
    }

    public void bye() {
        System.out.println("Bye");
    }
}
