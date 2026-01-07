/*
 * Write a Java program that accepts N integers using command line arguments and
 * prints the largest and smallest number
 */
class Numbers {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        int n = args.length;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        int max = a[0], min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max)
                max = a[i];
            if (a[i] < min)
                min = a[i];
        }
        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
    }
}
