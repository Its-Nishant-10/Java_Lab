interface inta {
    void show();
}

interface intb {
    void show();
}

class clc implements inta, intb {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        clc obj = new clc();
        obj.show();
    }

    public void show() {
        System.out.println("Same method implemented");
    }
}
