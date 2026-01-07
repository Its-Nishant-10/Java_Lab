/* Write a program to show HAS-A relationship using aggregation */
class CPU {
    void op() {
        System.out.println("CPU Op");
    }
}

class PC {
    CPU c = new CPU();

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        PC p = new PC();
        p.c.op();
    }
}