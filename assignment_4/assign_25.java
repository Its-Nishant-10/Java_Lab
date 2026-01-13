/* Demonstrate aggregation using array of objects inside another class */
class Obj {
    int id;

    Obj(int i) {
        id = i;
    }
}

class Box {

    Obj[] a;

    Box(Obj[] a) {
        this.a = a;
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        Obj[] list = {new Obj(1), new Obj(2)};
        new Box(list).show();
    }

    void show() {
        for (Obj obj : a) {
            System.out.println("ID: " + obj.id);
        }
    }
}
