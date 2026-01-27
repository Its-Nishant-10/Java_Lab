class Q10 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        try {
            int[] a = new int[2];
            a[3] = 5 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
