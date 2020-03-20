package LeetCode.Offer;

import java.util.Arrays;

public class offer13 {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int k = 1;
        int count = movingCount(m,n,k);
        System.out.println(count);


    }
    public static int movingCount(int m, int n, int k) {
        int[][] matrix = new int[m][n];
        int[][] mark = new int[m][n];
        int i = 0;
        int j = 0;
        canMove(matrix,i,j,k,mark);
        int count = 0;
        for(int x = 0;x<m;x++){
            for(int y=0;y<n;y++){
                if(matrix[x][y]==1){
                    count++;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        return count;
    }
    public static void canMove(int[][] matrix,int i,int j,int k,int[][] mark){
        if(i<0||j<0||i>=matrix.length||j>=matrix[0].length||!check(i,j,k)||mark[i][j]!=0){
            return;
        }
        matrix[i][j] = 1;
        mark[i][j] = 1;
        canMove(matrix,i+1,j,k,mark);
        canMove(matrix,i-1,j,k,mark);
        canMove(matrix,i,j+1,k,mark);
        canMove(matrix,i,j-1,k,mark);
        mark[i][j] = 0;
    }

    public static boolean check(int i,int j,int k){

        int nums = 0;
        while(i!=0){
            nums += i%10;
            i = (int) i/10;
        }
        while(j!=0){
            nums += j%10;
            j = (int) j/10;
        }


        if(nums<=k){
            return true;
        }

        return false;
    }
}