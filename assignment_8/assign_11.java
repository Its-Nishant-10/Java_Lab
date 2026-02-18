class as_1_q_11 {
    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        long t = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 10000; i++) s = s + "a";
        System.out.println("String: " + (System.currentTimeMillis() - t));

        t = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10000; i++) sb.append("a");
        System.out.println("StringBuffer: " + (System.currentTimeMillis() - t));

        t = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 10000; i++) sb2.append("a");
        System.out.println("StringBuilder: " + (System.currentTimeMillis() - t));
    }
}
