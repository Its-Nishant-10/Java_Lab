/*
 * Write a program demonstrating use of this to distinguish instance variables
 * from parameters
 */
class demo_1 {
   int x;

   demo_1(int x) {
      this.x = x;
   }

   public static void main(String[] args) {
      System.out.println("Nishant Nahar - 241551078");
      demo_1 d = new demo_1(10);
      System.out.println(d.x);
   }
}