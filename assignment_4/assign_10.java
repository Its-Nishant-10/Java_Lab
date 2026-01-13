/* Write a Java program to initialize array elements using a constructor. */
class arr {
    int a[];

    arr() {
        a = new int[]{1, 2, 3};
    }

    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        arr x = new arr();

        for (int i = 0; i < x.a.length; i++) {
            System.out.print(x.a[i] + " ");
        }
    }
}
