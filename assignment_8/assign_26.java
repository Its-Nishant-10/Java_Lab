class as_1_q_26 {
    public static void main(String[] args) {
        System.out.println("Nishant Nahar - 241551078");
        String s1 = "horse";
        String s2 = "ros";
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) dp[i][0] = i;
        for (int j = 0; j <= m; j++) dp[0][j] = j;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    int replace = dp[i - 1][j - 1];
                    int delete = dp[i - 1][j];
                    int insert = dp[i][j - 1];
                    int min = replace;
                    if (delete < min) min = delete;
                    if (insert < min) min = insert;
                    dp[i][j] = 1 + min;
                }
            }
        }
        System.out.println(dp[n][m]);
    }
}