class superr {
    int x = 10;
}

class thiss extends superr {
    int x = 20;

    thiss() {
        System.out.println("Nishant Nahar - 241551078");
        System.out.println(this.x);
        System.out.println(super.x);
    }

    public static void main(String[] a) {
        new thiss();
    }
}
