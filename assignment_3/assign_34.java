/*
 * Write a program that accepts two numbers and an operator (+, −, ×, /) using
 * command line arguments and performs the operation.
 */
class Calc {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        double n1 = Double.parseDouble(args[0]);
        double n2 = Double.parseDouble(args[1]);
        char op = args[2].charAt(0);
        double res = 0;
        if (op == '+')
            res = n1 + n2;
        else if (op == '-')
            res = n1 - n2;
        else if (op == '*')
            res = n1 * n2;
        else if (op == '/')
            res = n1 / n2;
        System.out.println("Result: " + res);
    }
}

