class as_1_q_28 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        String s = "abcXYZ";
        int shift = 2;
        String enc = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') enc += (char) ((c - 'a' + shift) % 26 + 'a');
            else if (c >= 'A' && c <= 'Z') enc += (char) ((c - 'A' + shift) % 26 + 'A');
            else enc += c;
        }
        System.out.println("Encrypted: " + enc);
    }
}