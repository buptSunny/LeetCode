package LeetCode.LC;

import java.util.Arrays;

public class Lc64 {
    public static void main(String[] args) {
        int[][] gird = {{1,3,1},{1,5,1},{4,2,1}};
        int m = gird.length;
        int n = gird[0].length;
        for(int i=1;i<m;i++){
            gird[i][0] = gird[i-1][0]+gird[i][0];
        }
        for(int j=1;j<n;j++){
            gird[0][j] = gird[0][j-1]+gird[0][j];
        }
        System.out.println(Arrays.deepToString(gird));
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                gird[i][j] = Math.min(gird[i-1][j],gird[i][j-1])+gird[i][j];
            }
        }

        System.out.println(Arrays.deepToString(gird));
    }
}
