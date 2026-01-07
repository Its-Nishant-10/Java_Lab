class Part {
    void show() {
        System.out.println("Part is alive");
    }
}

class Whole {
    Part p;

    Whole(Part p) {
        this.p = p;
    }
}

public class assign_30 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        Part part = new Part();
        Whole whole = new Whole(part);
        whole.p.show();
        whole = null;
        part.show();
    }
}