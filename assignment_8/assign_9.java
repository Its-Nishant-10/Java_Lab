class as_1_q_9 {
    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        String s1 = "listen";
        String s2 = "silent";
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            for (int j = 0; j < s2.length(); j++) {
                if (ch == s2.charAt(j)) {
                    s2 = s2.substring(0, j) + s2.substring(j + 1);
                    count = count + 1;
                    break;
                }
            }
        }
        if (count == s1.length()) System.out.println("Anagram");
        else System.out.println("Not Anagram");
    }
}
