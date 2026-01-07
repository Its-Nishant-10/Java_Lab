/*
 * Write a program that takes a string using command line arguments and counts
 * uppercase, lowercase, digits, and special character
 */
class CharCount {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar -- 241551078");
        String s = args[0];
        int u = 0, l = 0, d = 0, sp = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c))
                u++;
            else if (Character.isLowerCase(c))
                l++;
            else if (Character.isDigit(c))
                d++;
            else
                sp++;
        }
        System.out.println("Uppercase: " + u);
        System.out.println("Lowercase: " + l);
        System.out.println("Digits: " + d);
        System.out.println("Special: " + sp);
    }
}

