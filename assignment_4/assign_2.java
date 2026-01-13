/*
 * Write a Java program using a parameterized constructor to initialize student
 * details (roll, name, marks)
 */
class Student_2 {
    int roll;
    String name;
    int marks;

    Student_2(int r, String n, int m) {
        roll = r;
        name = n;
        marks = m;
    }

    public static void main(String[] args) {
        System.out.println("nishant nahar 241551078");
        Student_2 s = new Student_2(1, "Amit", 90);
        System.out.println(s.roll + " " + s.name + " " + s.marks);
    }
}