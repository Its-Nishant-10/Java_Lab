class as_1_q_3 {
    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        String s = "Abc123@$$5rwQiuo#";
        int v = 0, c = 0, d = 0, sp = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                v++;
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) c++;
            else if (ch >= '0' && ch <= '9') d++;
            else sp++;
        }
        System.out.println(v + " " + c + " " + d + " " + sp);
    }
}
