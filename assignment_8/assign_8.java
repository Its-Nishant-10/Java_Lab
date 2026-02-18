class as_1_q_8 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        String s = "nishant nahar";
        int max = 0;
        char cc = ' ';
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) count++;
            }
            if (count > max) {
                max = count;
                cc = s.charAt(i);
            }
        }
        System.out.println(cc + " " + max);
    }
}
