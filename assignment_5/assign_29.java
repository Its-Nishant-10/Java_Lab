class con_par {
    con_par() {
        System.out.println("1");
    }
}

class con_chi extends con_par {
    con_chi() {
        System.out.println("2");
    }

    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        con_par obj = new con_chi();
    }
}
