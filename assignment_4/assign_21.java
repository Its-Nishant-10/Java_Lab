/* Write a program showing constructor calling sequence in inheritance */
class P {
    P() {
        System.out.println("Parent");
    }
}

class S extends P {
    S() {
        super();
        System.out.println("Child");
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        new S();
    }
}