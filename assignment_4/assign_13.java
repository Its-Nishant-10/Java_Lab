/* Create a class where a method returns this reference */
class Ret {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        Ret r = new Ret();
        System.out.println(r.get());
    }

    Ret get() {
        return this;
    }
}
