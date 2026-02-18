class as_1_q_12 {
    public static String toggleCase(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') r = r + (char) (ch - 32);
            else if (ch >= 'A' && ch <= 'Z') r = r + (char) (ch + 32);
            else r = r + ch;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        String s = "Hola Amigos` ";
        String t = toggleCase(s);
        System.out.println(t);
    }
}
