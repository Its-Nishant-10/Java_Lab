class as_1_q_5 {
    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        String s = "A man a plan a canal Panama".toLowerCase();
        int i = 0, j = s.length() - 1;
        boolean f = true;
        while (i < j) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if (c1 == ' ') {
                i++;
                continue;
            }
            if (c2 == ' ') {
                j--;
                continue;
            }
            if (c1 != c2) {
                f = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(f);
    }
}
