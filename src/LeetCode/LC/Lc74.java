package LeetCode.LC;

import java.util.concurrent.ConcurrentHashMap;

public class Lc74 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int m = 0;
        int target  = 3;
        int n = matrix[0].length-1;
        while(n>=0&&m<=matrix.length-1){
            System.out.println(matrix[m][n]);
            while(n>=0&&m<=matrix.length-1&&target<matrix[m][n]){
                n--;
            }
            while(n>=0&&m<=matrix.length-1&&target>matrix[m][n]){
                m++;
            }
            if(n>=0&&m<=matrix.length-1&&target==matrix[m][n]){
                System.out.println("true");
                break;
            }
        }


        ConcurrentHashMap map = new ConcurrentHashMap();
        System.out.println("false");
    }
}
