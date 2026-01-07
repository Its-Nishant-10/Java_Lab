/*
 * Create a class Employee with a constructor that takes employee id and salary
 * and displays them
 */
class emp_01 {
   int id;
   double salary;

   emp_01(int i, double s) {
      id = i;
      salary = s;
   }

   public static void main(String[] args) {
      System.out.println("Nishant Nahar : 241551078");
      emp_01 e = new emp_01(1, 234560);
      emp_01 e1 = new emp_01(2, 75340);
      System.out.println("ID " + e.id + " Salary " + e.salary);
      System.out.println("ID " + e1.id + " Salary " + e1.salary);
   }
}