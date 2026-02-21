class stat_par {
    static void show() {
        System.out.println("1");
    }
}

class stat_chi extends stat_par {
    static void show() {
        System.out.println("2");
    }

    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        stat_par obj = new stat_chi();
        System.out.println(obj.getClass().getName());
        stat_par.show();
    }
}
