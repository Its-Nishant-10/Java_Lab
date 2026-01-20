abstract class ani {
    void bre() {
        System.out.println("Hello NEWS");
    }
}

class dni extends ani {
}

class cni extends ani {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        dni d = new dni();
        cni c = new cni();
        d.bre();
        c.bre();
    }
}
