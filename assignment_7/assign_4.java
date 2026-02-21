@SuppressWarnings("null")
class Q4 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
