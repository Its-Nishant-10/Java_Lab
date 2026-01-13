/*
 * Write a Java program to demonstrate single inheritance using Person and
 * Student
 */
class Person {
    String n = "Nishant";
}

class stud extends Person {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        new stud().d();
    }

    void d() {
        System.out.println(n);
    }
}