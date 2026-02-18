class as_1_q_18 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        String s = "abcfd";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
                count++;
            }
        }
        System.out.println("Total substrings: " + count);
    }
}
