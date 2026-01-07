/* Write a Java program to demonstrate aggregation using Address and Employee */
class Add {
   String c = "City";
}

class Emp {
   Add a;

   Emp(Add a) {
      this.a = a;
   }

   public static void main(String[] args) {
      System.out.println("Nishant Nahar - 241551078");
      Add ad = new Add();
      new Emp(ad);
   }
}