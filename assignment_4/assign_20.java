/*
 * Create a program to show multilevel inheritance using Vehicle → Car →
 * ElectricCar
 */
class V {
   void type() {
      System.out.println("Vehicle");
   }
}

class Car extends V {
   void brand() {
      System.out.println("Car");
   }
}

class EC extends Car {
   void bat() {
      System.out.println("Electric Battery");
   }

   public static void main(String[] args) {
      System.out.println("Nishant Nahar - 241551078");
      EC o = new EC();
      o.type();
      o.brand();
      o.bat();
   }
}