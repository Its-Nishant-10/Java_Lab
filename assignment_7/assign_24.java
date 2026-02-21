class Q24 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");

        try {
            int a = 10 / 0;
            System.out.println(a);
        } finally {
            int b = 20 / 0;
            System.out.println(b);
        }
    }
}
