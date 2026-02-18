class as_1_q_20 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        String s = "abcdegwij";
        int n = s.length();
        int f = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    f = 1;
                    break;
                }
            }
            if (f == 1) break;
        }

        if (f == 0) System.out.println("Unique");
        else System.out.println("Not Unique");
    }
}
