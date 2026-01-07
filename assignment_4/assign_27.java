/* Create a College class that contains Student objects using aggregation */
class Stu {
    String n;

    Stu(String n) {
        this.n = n;
    }
}

class Col {
    Stu[] s;

    Col(Stu[] s) {
        this.s = s;
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        Stu[] list = { new Stu("S1"), new Stu("S2") };
        Col c = new Col(list);
        for (Stu student : c.s) {
            System.out.println(student.n);
        }
    }
}