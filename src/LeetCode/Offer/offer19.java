package LeetCode.Offer;

public class offer19 {
    public static void main(String[] args) {
        String s = "aa";
        String p = "ab*a";
        boolean res = isMatch(s, p);
        System.out.println(res);
    }

    private static boolean isMatch(String s, String p) {
          /*
            记住 字符串匹配，就用动态规划
        */
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        // 初始化dp
        for (int i = 1; i <= s.length(); i++) {
            dp[i][0] = false;
        }
        for (int j = 1; j <= p.length(); j++) {
            dp[0][j] = false;
        }

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    int temp = i;
                    while (temp >= 1 && p.charAt(j - 2) == s.charAt(temp - 1)) {
                        temp--;
                    }
                    dp[i][j] = dp[temp][j - 2];
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}
