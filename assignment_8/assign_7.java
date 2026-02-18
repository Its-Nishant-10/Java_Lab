class as_1_q_7 {
    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        String s = "programming";
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (r.contains(ch + "") == false) {
                r = r + ch;
            }
        }
        System.out.println(r);
    }
}
