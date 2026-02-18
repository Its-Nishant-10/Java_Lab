class as_1_q_23 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        String s1 = "hello";
        String s2 = "hollo";
        int n1 = s1.length();
        int n2 = s2.length();
        int f = 0;

        if (n1 == n2) {
            for (int i = 0; i < n1; i++) {
                if (s1.charAt(i) != s2.charAt(i)) f++;
            }
        } else f = -1;

        if (f == 1) System.out.println("Yes, differ by 1");
        else System.out.println("No");
    }
}
