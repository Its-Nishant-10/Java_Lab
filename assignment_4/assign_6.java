/*
 * Write a Java program where a constructor counts the number of objects created
 */
class Count {
   static int count = 0; // so that it doesn't change back to 0

   Count() {
      count++;
   }

   public static void main(String[] args) {
      new Count();
      new Count();
      new Count();
      System.out.println(count);
   }
}