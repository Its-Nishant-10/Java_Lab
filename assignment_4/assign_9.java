/*
 * Create a class Time with constructor to accept hours, minutes, seconds and
 * normalize time.
 */
class t {
   int h, m, s;

   t(int hr, int mi, int se) {
      s = se % 60;
      mi += se / 60;
      m = mi % 60;
      h = h + mi / 60;
   }

   public static void main(String[] args) {
      System.out.println("Nishant Nahar - 241551078");
      t ti = new t(1, 70, 80);
      System.out.println(ti.h + ":" + ti.m + ":" + ti.s);
   }
}