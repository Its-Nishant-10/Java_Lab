class as_1_q_10 {
    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        String s = "swiss";
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) count = count + 1;
            }
            if (count == 1) {
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
