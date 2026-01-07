/* Demonstrate aggregation with constructor-based object passing. */
class Tool {
    String type;

    Tool(String t) {
        type = t;
    }
}

class Worker {
    Tool t;

    Worker(Tool t) {
        this.t = t;
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        Worker w = new Worker(new Tool("Drill"));
        System.out.println(w.t.type);
    }
}