class Q18 {
    static void test(int a) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int[] arr = {1, 2};
        System.out.println(arr[a]);
        System.out.println(10 / a);
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        test(0);
    }
}
