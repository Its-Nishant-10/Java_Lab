/* Demonstrate method chaining using this */
class assign {
   assign a1() {
      System.out.println("a1");
      return this;
   }

   assign a2() {
      System.out.println("a2");
      return this;
   }

   public static void main(String[] args) {
      System.out.println("Nishant Nahar - 241551078");
      new assign().a1();
      new assign().a2();
   }
}
