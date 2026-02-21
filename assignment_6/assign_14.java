interface assi_1 {
    void sound();
}

class d1 implements assi_1 {
    public void sound() {
        System.out.println("Bark");
    }
}

class c1 implements assi_1 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        assi_1 ar;
        ar = new d1();
        ar.sound();
        ar = new c1();
        ar.sound();
    }

    public void sound() {
        System.out.println("Meow");
    }
}
