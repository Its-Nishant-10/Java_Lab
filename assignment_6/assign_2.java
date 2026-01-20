abstract class Bas {
    Bas() {
        System.out.println("Abstract");
    }
}

class Unbase extends Bas {
    Unbase() {
        System.out.println("Unbase");
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        new Unbase();
    }
}
