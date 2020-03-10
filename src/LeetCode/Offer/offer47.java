package LeetCode.Offer;

import java.util.Arrays;

public class offer47 {
    public static void main(String[] args) {
        int[][] matrix = {{1,10,3,8},{12,2,9,6},{5,7,4,11},{3,7,16,5}};
        int[][] matrixSup = new int[4][4];
        matrixSup[3][3] = 5;
        /*
            初始化matrixSup
         */
        for(int i=2;i>=0;i--){
            matrixSup[i][3] = matrix[i][3]+matrixSup[i+1][3];
            matrixSup[3][i] = matrix[3][i]+matrixSup[3][i+1];
        }
        /*
            dp
         */
        for(int i=matrix.length-1-1;i>=0;i--){
            for(int j=matrix[0].length-1-1;j>=0;j--){
                matrixSup[i][j] = Math.max(matrixSup[i+1][j],matrixSup[i][j+1])+matrix[i][j];
                System.out.println(matrixSup[i][j]);
            }
        }
        System.out.println(matrixSup[0][0]);
    }
}
