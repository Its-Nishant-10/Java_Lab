class Q2 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        int[] a = {1, 2, 3};
        try {
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
