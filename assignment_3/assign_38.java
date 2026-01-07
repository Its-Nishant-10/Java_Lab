/*
 * Write a program that accepts array size and elements via command line
 * arguments, stores them in an array of objects, and prints the detail
 */
class item_1 {
    String name;
    int val;

    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");

        if (args.length == 0) {
            return;
        }

        int n = Integer.parseInt(args[0]);

        if (args.length < 1 + n * 2) {
            return;
        }

        item_1[] it = new item_1[n];
        for (int i = 0; i < n; i++) {
            it[i] = new item_1();
            it[i].name = args[1 + i * 2];
            it[i].val = Integer.parseInt(args[2 + i * 2]);
            System.out.println(it[i].name + " " + it[i].val);
        }
    }
}
