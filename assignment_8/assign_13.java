class as_1_q_13 {
    public static String rmv(String s) {
        boolean sp = false;
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                temp = temp + c;
                sp = false;
            } else {
                if (!sp) {
                    temp = temp + ' ';
                    sp = true;
                }
            }
        }
        s = temp;
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        String s = "How    are    you doing my    buddy   ?";
        s = rmv(s);
        System.out.println(s);
    }
}
