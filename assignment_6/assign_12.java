interface shp {
    int sd = 0;

    void draw();
}

class crl implements shp {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        crl c = new crl();
        c.draw();
    }

    public void draw() {
        System.out.println("Drawing Circle");
        System.out.println("Sides: " + sd);
    }
}
