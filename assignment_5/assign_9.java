class par_21 {
    int x = 10;

    void show() {
        System.out.println("Parent");
    }
}

class chi_21 extends par_21 {
    int x = 20;

    chi_21() {
        System.out.println("Nishant Nahar - 241551078");
        System.out.println(super.x);
        super.show();
    }

    public static void main(String[] a) {
        new chi_21();
    }
}

