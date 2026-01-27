class Q17 {
    static void test() throws Exception {
        throw new Exception("Thrown");
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        try {
            test();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
