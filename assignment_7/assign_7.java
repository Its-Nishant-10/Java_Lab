class Q7 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception a) {
            System.out.println(a);
        }
    }
}
