/*
 * Create a class Book with a constructor that calculates total price based on
 * quantity and unit price
 */
class Book {
   double price_unit;
   int quantity;
   double total_price;

   Book(double p, int q) {
      price_unit = p;
      quantity = q;
      total_price = price_unit * quantity;
   }

   public static void main(String[] args) {
      System.out.println("Nishant Nahar : 241551078");
      Book b1 = new Book(234.99, 20);
      Book b2 = new Book(560.87, 4);
      System.out.println("The total price of b1 is " + b1.total_price);
      System.out.println("The total price of b2 is " + b2.total_price);
   }
}