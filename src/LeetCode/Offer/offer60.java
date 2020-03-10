package LeetCode.Offer;

public class offer60 {
    static int jisuan = 0;
    public static void main(String[] args) {
        int n = 3;
        int min = n;
        int max = 6*n;
        int[] arrays = new int[max-min+1];
        /*
            计算每一个数字出现的概率。
         */
        for(int i=min;i<=max;i++){
            arrays[i-min] = CalculatNumsPro(i,n);
            System.out.println(arrays[i-min]);
            System.out.println(arrays[i-min]/Math.pow(6,n));
        }

        int[][] dp = new int[n][max+1];
        for(int j=1;j<7;j++){
            dp[0][j] = 1;
        }
        for(int i=1;i<n;i++){
            for(int j=i;j<=max;j++){
                int tmp1 = ((j - 1 ) > 0 ? dp[i-1][j-1] : 0);
                int tmp2 = ((j - 2 ) > 0 ? dp[i-1][j-2] : 0);
                int tmp3 = ((j - 3 ) > 0 ? dp[i-1][j-3] : 0);
                int tmp4 = ((j - 4 ) > 0 ? dp[i-1][j-4] : 0);
                int tmp5 = ((j - 5 ) > 0 ? dp[i-1][j-5] : 0);
                int tmp6 = ((j - 6 ) > 0 ? dp[i-1][j-6] : 0);
                dp[i][j] = tmp1+tmp2+tmp3+tmp4+tmp5+tmp6;
//                System.out.println(dp[i][j]);
//                System.out.println("i="+String.valueOf(i));
//                System.out.println("j="+String.valueOf(j));
            }
        }


        for(int j=min;j<max;j++){
            System.out.println(dp[n-1][j]);
        }





    }
    private static int CalculatNumsPro(int sum,int n) {
        /*
            i 总的点数;n个骰子；
            把所有n个骰子的排列组合加起来，判断和是否为i，是的话结果+1；
         */
        if(n==1){
            if(sum<=6&&sum>=1){
                return 1;
            }
            else{
                return 0;
            }
        }
        return CalculatNumsPro(sum-1 ,n-1)+CalculatNumsPro(sum-2 ,n-1)+CalculatNumsPro(sum-3 ,n-1)+CalculatNumsPro(sum-4 ,n-1)+CalculatNumsPro(sum-5 ,n-1)+CalculatNumsPro(sum-6 ,n-1);
    }
}
