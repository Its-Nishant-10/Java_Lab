class var_par {
    int x = 10;
}

class var_chi extends var_par {
    int x = 20;

    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        var_par obj = new var_chi();
        System.out.println(obj.x);
    }
}
