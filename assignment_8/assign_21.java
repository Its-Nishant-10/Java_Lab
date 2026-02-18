class as_1_q_21 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        String s = "192.168.1.1";
        String[] p = s.split("\\.");
        int f = 0;

        if (p.length == 4) {
            for (int i = 0; i < 4; i++) {
                int n = Integer.parseInt(p[i]);
                if (n < 0 || n > 255) {
                    f = 1;
                    break;
                }
            }
        } else f = 1;

        if (f == 0) System.out.println("Valid");
        else System.out.println("Invalid");
    }
}
