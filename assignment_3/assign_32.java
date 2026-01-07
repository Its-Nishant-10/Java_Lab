/*
 * Write a program to calculate the sum and average of numbers passed through
 * command line arguments.
 */
class SumAvg {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        int n = args.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(args[i]);
        }
        double avg = (double) sum / n;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}

