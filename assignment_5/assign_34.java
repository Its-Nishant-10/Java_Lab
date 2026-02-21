class arr_p {
    void show() {
        System.out.println("1");
    }
}

class arr_c extends arr_p {
    public static void main(String[] a) {
        System.out.println("Nishant Nahar - 241551078");
        arr_p[] arr = {new arr_p(), new arr_c()};
        for (arr_p x : arr) x.show();
    }

    void show() {
        System.out.println("2");
    }
}
