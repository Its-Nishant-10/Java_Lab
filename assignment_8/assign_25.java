class as_1_q_25 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        String p = "abba";
        String s = "dog cat cat dog";
        String[] w = s.split(" ");

        if (p.length() != w.length) {
            System.out.println("No");
            return;
        }

        for (int i = 0; i < p.length(); i++) {
            for (int j = i + 1; j < p.length(); j++) {
                if (p.charAt(i) == p.charAt(j) && !w[i].equals(w[j])) {
                    System.out.println("No");
                    return;
                }
                if (p.charAt(i) != p.charAt(j) && w[i].equals(w[j])) {
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");
    }
}
