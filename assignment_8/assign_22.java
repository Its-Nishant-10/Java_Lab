class as_1_q_22 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        String s = "Nishant Pankaj Nahar";
        String t = "Pankaj Nahar";
        int n = s.length();
        int m = t.length();
        int index = -1;

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (s.charAt(i + j) != t.charAt(j)) break;
            }
            if (j == m) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
