abstract class S_1 {
    int sides = 4;

    final void show() {
        System.out.println("Sides: " + sides);
    }
}

class Square extends S_1 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        Square s = new Square();
        s.show();
    }
}
