class deed {

    static class K {
        void type() {
            System.out.println("Tight");
        }
    }

    static class CT {
        void work() {
            new K().type();
        }
    }

    interface I {
        void input();
    }

    static class KL implements I {
        public void input() {
            System.out.println("Loose");
        }
    }

    static class CL {
        void work(I i) {
            i.input();
        }
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        new CT().work();
        new CL().work(new KL());
    }
}
