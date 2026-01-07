/*
 * Write a Java program that accepts multiple numbers via command line arguments
 * and prints only prime numbers
 */
class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        int n = args.length;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(args[i]);
            boolean prime = true;
            if (num < 2)
                prime = false;
            for (int j = 2; j <= num / 2; j++) {
                if (num % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime)
                System.out.println(num);
        }
    }
}

