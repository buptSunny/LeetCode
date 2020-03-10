package LeetCode.LC;

public class Lc62 {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        int nums[][] = new int[m][n];
        for(int i=0;i<m;i++){
            nums[i][0] = 1;
        }
        for(int j=0;j<n;j++){
            nums[0][j] = 1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                nums[i][j] = nums[i-1][j] + nums[i][j-1];
            }
        }

        System.out.println(nums[m-1][n-1]);


    }
}
