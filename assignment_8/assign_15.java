class as_1_q_15 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        String s = "aabbccddggffrryt";
        StringBuilder r = new StringBuilder();
        int c = 1;

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) c++;
            else {
                r.append(s.charAt(i)).append(c);
                c = 1;
            }
        }
        System.out.println(r);
    }
}
