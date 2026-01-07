/* . Write a program showing how this improves code readability */
class A {
   int x;

   A(int x) {
      this.x = x;
   }

   void d() {
      System.out.println(x);
   }

   public static void main(String[] args) {
      System.out.println("Nishant Nahar - 241551078");
      A o = new A(10);
      o.d();
   }
}