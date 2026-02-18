class as_1_q_16 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        String p = "Abc123$";
        int count = 0;

        if (p.length() >= 6) {
            for (int i = 0; i < p.length(); i++) {
                char c = p.charAt(i);
                if (c >= 'A' && c <= 'Z') count++;
                else if (c >= 'a' && c <= 'z') count++;
                else if (c >= '0' && c <= '9') count++;
                else if ("!@#$%^&*()".indexOf(c) != -1) count++;
            }
        }

        if (count >= 5) System.out.println("Valid");
        else System.out.println("Invalid");
    }
}
