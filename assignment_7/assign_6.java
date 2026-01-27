class Q6 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        try {
            int[] a = new int[2];
            a[3] = 23 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(a);
        }
    }
}
