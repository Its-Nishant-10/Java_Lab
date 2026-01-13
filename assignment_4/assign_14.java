/* Write a program to pass current object as method argument using this */
class Argu {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        Argu a = new Argu();
        a.fail();
    }

    void hello(Argu a) {
        System.out.println("Hello Ji");
    }

    void fail() {
        hello(this);
    }
}