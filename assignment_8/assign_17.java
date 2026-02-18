class as_1_q_17 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        String s1 = "nish";
        String s2 = "shni";
        int n = s1.length();
        int found = 0;

        if (s1.length() == s2.length()) {
            for (int i = 0; i < n; i++) {
                int j;
                for (j = 0; j < n; j++) {
                    if (s1.charAt((i + j) % n) != s2.charAt(j)) break;
                }
                if (j == n) {
                    found = 1;
                    break;
                }
            }
        }
        if (found == 1) System.out.println("Rotation");
        else System.out.println("Not Rotation");
    }
}