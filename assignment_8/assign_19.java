class as_1_q_19 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        String s = "Java is fun. Java is powerful. java was easy. Java is not good.".toLowerCase();
        String[] w = s.split(" ");
        String max = w[0];
        int fmax = 0;

        for (int i = 0; i < w.length; i++) {
            int f = 0;
            for (int j = 0; j < w.length; j++) {
                if (w[i].equals(w[j])) f++;
            }
            if (f > fmax) {
                fmax = f;
                max = w[i];
            }
        }

        System.out.println(max);
    }
}
