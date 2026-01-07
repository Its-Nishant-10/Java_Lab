/* Create a class Engine and aggregate it inside a Car class */
class Eng {
   String t;

   Eng(String t) {
      this.t = t;
   }
}

class car_1 {
   String m;
   Eng e;

   car_1(String m, Eng e) {
      this.m = m;
      this.e = e;
   }

   void d() {
      System.out.println(m + " has " + e.t);
   }

   public static void main(String[] args) {
      System.out.println("Nishant Nahar - 241551078");
      Eng en = new Eng("V8");
      car_1 c = new car_1("Mustang", en);
      c.d();
   }
}