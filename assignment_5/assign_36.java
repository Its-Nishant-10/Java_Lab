class ret_me_1 {
    ret_me_1 show(ret_me_1 r) {
        System.out.println("1");
        return r;
    }
}

class ret_me_2 extends ret_me_1 {
    ret_me_2 show(ret_me_2 r) {
        System.out.println("2");
        return r;
    }

    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        ret_me_1 p = new ret_me_2();
        p.show(new ret_me_1());
    }
}
