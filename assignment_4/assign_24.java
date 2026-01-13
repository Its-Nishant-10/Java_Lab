/* Write a program where a Department has multiple Teacher objects */
class T {
    String n;

    T(String n) {
        this.n = n;
    }
}

class Dept {
    String d;
    T[] ts;

    Dept(String d, T[] ts) {
        this.d = d;
        this.ts = ts;
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        T[] arr = {new T("Amit"), new T("Sumit")};
        Dept d = new Dept("CS", arr);
        d.list();
    }

    void list() {
        for (T t : ts)
            System.out.println(d + " : " + t.n);
    }
}