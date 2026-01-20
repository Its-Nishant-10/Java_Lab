abstract class Game {
    final void play() {
        start();
        move();
        end();
    }

    abstract void move();

    void start() {
        System.out.println("Start");
    }

    abstract void end();
}

class VC extends Game {
    void move() {
        System.out.println("Move");
    }
    void end() {
        System.out.println("End");
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        Game g = new VC();
        g.play();
    }
}
