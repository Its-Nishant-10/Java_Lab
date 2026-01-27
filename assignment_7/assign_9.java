class Q9 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        try {
            String s = null;
            s.length();
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }
}
