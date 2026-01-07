/* Use this keyword inside constructor to avoid variable shadowing (meaning is to use same variable name but no conflict) */
class B {
   int a;

   B(int a) {
      this.a = a;
      System.out.println(this.a);
   }

   public static void main(String[] args) {
      System.out.println("Nishant Nahar - 241551078");
      new B(5);
   }
}