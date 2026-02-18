class as_1_q_24 {
    static void perm(String p, String up) {
        if (up.length() == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 0; i < up.length(); i++) {
            perm(p + up.charAt(i), up.substring(0, i) + up.substring(i + 1));
        }
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        String s = "abc";
        perm("", s);
    }
}
