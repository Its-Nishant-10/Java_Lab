interface Operation {
    int calculate(int a, int b);
}

class LambdaExample {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        Operation add = (a, b) -> a + b;
        Operation multiply = (a, b) -> a * b;

        System.out.println("Sum: " + add.calculate(5, 3));
        System.out.println("Product: " + multiply.calculate(5, 3));
    }
}
