/*
 * Write a Java program that accepts employee salaries via command line
 * arguments and displays salaries above the average salary.
 */
class Salary {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        int n = args.length;
        double[] s = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            s[i] = Double.parseDouble(args[i]);
            sum += s[i];
        }
        double avg = sum / n;
        System.out.println("Salaries above average:");
        for (int i = 0; i < n; i++) {
            if (s[i] > avg)
                System.out.println(s[i]);
        }
    }
}

