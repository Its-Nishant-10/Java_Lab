class Q3 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        try {
            int n = Integer.parseInt("abc");
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
