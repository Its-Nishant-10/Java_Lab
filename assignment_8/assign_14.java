class as_1_q_14 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        String s = "Java programming is fun and powerful";
        String[] w = s.split(" ");
        String longWord = "", shortWord = w[0];

        for (int i = 0; i < w.length; i++) {
            if (w[i].length() > longWord.length()) longWord = w[i];
            if (w[i].length() < shortWord.length()) shortWord = w[i];
        }
        System.out.println("Longest: " + longWord);
        System.out.println("Shortest: " + shortWord);
    }
}
