class as_1_q_4 {
    static String r(String s) {
        if (s.equals("")) return "";
        return r(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        String s = "Java";
        System.out.println(r(s));
    }
}
