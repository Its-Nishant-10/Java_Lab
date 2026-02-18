import java.util.Scanner;

class as_1_q_30 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        Scanner sc = new Scanner(System.in);
        String s = "Hello My Name is Nishant";
        while (true) {
            System.out.println("1.Length 2.Upper 3.Lower 4.Split 5.Reverse 6.Exit");
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch == 1) System.out.println(s.length());
            else if (ch == 2) System.out.println(s.toUpperCase());
            else if (ch == 3) System.out.println(s.toLowerCase());
            else if (ch == 4) {
                String[] t = s.split("");
                for (String x : t) System.out.print(x + " ");
                System.out.println();
            } else if (ch == 5) System.out.println(r(s));
            else break;
        }
        sc.close();
    }

    static String r(String s) {
        String t = "";
        for (int i = s.length() - 1; i >= 0; i--) t += s.charAt(i);
        return t;
    }
}
