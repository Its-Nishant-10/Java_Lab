/* Write a program where omission of super() causes a compilation error. */
class par_1 {
    par_1(int x) {
        System.out.println(x);
    }
}

class chi_1 extends par_1 {
    chi_1() {
        System.out.println("chi_1");
    }

    static public void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        chi_1 c = new chi_1();
    }
}
