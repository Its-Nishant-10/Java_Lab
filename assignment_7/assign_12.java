class Q12 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        System.out.println(test());
    }

    static int test() {
        try {
            return 10;
        } finally {
            System.out.println("runs");
        }
    }
}
