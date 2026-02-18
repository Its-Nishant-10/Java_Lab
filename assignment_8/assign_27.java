class as_1_q_27 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        String s = "A man, a plan, a canal: Panama";
        s = s.toLowerCase();
        String clean = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) clean += c;
        }
        int i = 0, j = clean.length() - 1;
        while (i < j) {
            if (clean.charAt(i) != clean.charAt(j)) {
                System.out.println("No");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Yes");
    }
}
