class as_1_q_6 {
    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        String s = "This is java code written by me ";
        s = s.trim();
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') c++;
        }
        System.out.println(c + 1);
    }
}
