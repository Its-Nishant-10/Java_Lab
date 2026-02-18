class as_1_q_29 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        String s = "bababd", r = "";
        for (int i = 0; i < s.length(); i++) {
            String o = e(s, i, i), v = e(s, i, i + 1);
            if (o.length() > r.length()) r = o;
            if (v.length() > r.length()) r = v;
        }
        System.out.println(r);
    }

    static String e(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
}
