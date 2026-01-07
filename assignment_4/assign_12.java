/* Use this() to call another constructor within the same class. */
class Cons {
   Cons() {
      this(34);
   }

   Cons(int x) {
      System.out.println(x);
   }

   public static void main(String[] args) {
      System.out.println("Nishant Nahar - 241551078");
      new Cons();
   }
}