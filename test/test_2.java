/*
 * Write a Java program that satisfies all of the following conditions:
 * 1. Create a class Time with instance variables hours, minutes, and seconds.
 * 2. Use a parameterized constructor to initialize the variables and normalize
 * the time so that:
 * A. seconds < 60
 * B. minutes < 60
 * 3. Use the this keyword to distinguish between instance variables and
 * constructor parameters.
 * 4. Create a method addSeconds(int s) that:
 * A. Adds s seconds to the current time
 * B. Returns the current object to enable method chaining.
 * 5. In the main() method:
 * A. Create one Time object
 * B. Call addSeconds() twice using method chaining
 * C. Display the final normalized time in HH:MM:SS format.
 */
class Time {
   int hours, minutes, seconds;

   Time(int hours, int minutes, int seconds) {
      if (seconds >= 60) {
         minutes = minutes + (seconds / 60);
         seconds = seconds % 60;
      }
      if (minutes >= 60) {
         hours = hours + (minutes / 60);
         minutes = minutes % 60;
      }
      this.hours = hours;
      this.minutes = minutes;
      this.seconds = seconds;
   }

   Time addSeconds(int s) {
      seconds = seconds + s;
      return new Time(hours, minutes, seconds);
   }

   public static void main(String[] args) {
      System.out.println("Nishant Nahar - 241551078");
      Time t = new Time(1, 89, 50);
      t = t.addSeconds(15);
      t = t.addSeconds(90);
      System.out.println("Time " + t.hours + ":" + t.minutes + ":" + t.seconds);
   }
}