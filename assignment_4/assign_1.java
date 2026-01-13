/*  Write a Java program to demonstrate a default constructor that initializes data members with default values */
class Demo {
    int a;
    String b;

    Demo() {
        a = 241551078;
        b = "Hello Nishant Here";
    }

    static void main(String[] args) {
        System.out.println("Nishant Nahar : 241551078");
        Demo a = new Demo();
        System.out.println(a.a + " " + a.b);
    }
}